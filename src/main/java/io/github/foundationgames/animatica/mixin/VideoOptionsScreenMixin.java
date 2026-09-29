package io.github.foundationgames.animatica.mixin;

import io.github.foundationgames.animatica.Animatica;
import net.minecraft.client.gui.screens.options.OptionsSubScreen;
import net.minecraft.client.gui.screens.options.VideoSettingsScreen;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VideoSettingsScreen.class)
public abstract class VideoOptionsScreenMixin extends OptionsSubScreen {
    protected VideoOptionsScreenMixin(Component title) {
        super(null, null, title);
    }

    @Inject(method = "addOptions", at = @At("TAIL"))
    private void animatica$addTextureAnimationOptionButton(CallbackInfo ci) {
        this.list.addBig(Animatica.CONFIG.getAnimatedTexturesOption());
    }
}
