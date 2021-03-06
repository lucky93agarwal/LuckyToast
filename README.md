# LuckyToast
[![API](https://img.shields.io/badge/API-14%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=14)  [![](https://jitpack.io/v/lucky93agarwal/LuckyToast.svg)](https://jitpack.io/#lucky93agarwal/LuckyToast)


Simple Toast library

> Step 1. Add the JitPack repository to your build file

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```


  > Step 2. Add the dependency

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
  dependencies {
	        implementation 'com.github.lucky93agarwal:LuckyToast:Tag'
	}
```



## Configuration

This step is optional, but if you want you can configure some Toasty parameters. Place this anywhere in your app:


```java

LuckyToast.simpleToast(context, message, duration);

```
## Example
``` java

LuckyToast.simpleToast(MainActivity.this,"Show New Data",1); // required

```

