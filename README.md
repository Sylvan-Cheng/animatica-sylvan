# Animatica Continuation: Sylvan Edition

面向 Minecraft 26.1.2、Fabric 的 Animatica 非官方移植尝试。模组用于加载资源包中的 MCPatcher/OptiFine 自定义动画纹理定义。

## 支持范围

- GUI、实体、方块实体、盔甲等纹理动画
- 动画定义目录：`optifine/anim/`、`mcpatcher/anim/`、`animatica/anim/`
- 原版 `.mcmeta` 动画仍由 Minecraft 自身处理

不提供自定义 GUI、实体模型、连接纹理或其他 MCPatcher/OptiFine 功能。

## 当前状态

这是基于 Animatica Continuation `0.6+1.21.11` 的 26.1.2 非官方移植版。已通过本机离线 Gradle 构建和 Fabric 客户端启动测试，并使用 Recolourful Containers GUI + HUD `3.1.3` 验证附魔台、铁砧、炉火和信标动画。该实测只覆盖此资源包，其他资源包仍需测试。

## 构建

需要 JDK 25。执行：

```powershell
.\gradlew.bat build
```

产物位于 `build/libs/`。

## 来源与许可

- 原版 Animatica：[FoundationGames/Animatica](https://github.com/FoundationGames/Animatica)
- 1.21.11 延续版：[EthanVisagie/Animatica-Continuation](https://github.com/EthanVisagie/Animatica-Continuation/tree/1.21.11)
- 本项目沿用仓库中的 LGPL-3.0-or-later 许可。上游版权和许可文本保留在 `LICENSE`。
