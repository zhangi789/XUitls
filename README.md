## 如何使用它

> Step 1.先在 build.gradle(Project:XXXX) 的 repositories 添加:

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
> Step 2. 然后在 build.gradle(Module:app) 的 dependencies 添加:

	dependencies {
	       //基础工具库
          implementation 'com.github.zhangi789:XUitls:1.1'
	}

    使用方法:
    在Application中初始化 RxApi.init(this);
