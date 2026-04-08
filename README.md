# 仿写博客后台系统开发
## 项目内容介绍
*本项目是一个使用 spring boot 框架的多模块单点部署项目。*
## 项目模块介绍
- 后端主要分为接口模块和功能模块，接口模块分为管理员页面和游客页面的接口模块，功能模块主要有 jwt 模块，search 模块，以及 常用类 common 模块。*
- 分支名对应模块名，release1.0 保存了整个项目的整合 1.0 版本
- 接口模块下可以细分为controller 、service 模块、 vo 模块、config 模块、convert 模块，以及其他模块，这个会根据集成的功能进行自定义的添加，例如，事件监听的 event 模块，WebSocket 协议模块、Markdown 解析模块以及 utils 集成工具模块
- jwt 模块下可以细分配置模块、filter 模块、 handler 模块、util 模块 、service 模块、model 模块、
