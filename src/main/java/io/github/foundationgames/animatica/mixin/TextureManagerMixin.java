package io.github.foundationgames.animatica.mixin;

import io.github.foundationgames.animatica.Animatica;
import io.github.foundationgames.animatica.animation.AnimationLoader;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TextureManager.class)
public class TextureManagerMixin {
    @Inject(method = "getTexture", at = @At("HEAD"), cancellable = true)
    private void animatica$replaceWithAnimatedTexture(Identifier old, CallbackInfoReturnable<AbstractTexture> cir) {
        if (Animatica.CONFIG.animatedTextures) {
            var anim = AnimationLoader.INSTANCE.getAnimationId(old);
            if (anim != null) {
                cir.setReturnValue(((TextureManager)(Object)this).getTexture(anim));
            }
        }
    }
}
