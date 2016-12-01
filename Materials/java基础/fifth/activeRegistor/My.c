#include <stdio.h>
#include <jni.h>

//native fun native方法所在的类名+native方法名 构成函数名
JNIEXPORT void HelloWorld_sayHello(JNIEnv * env ,jclass cl)
{
	printf("hello JNI\n");
}

//native table
static JNINativeMethod gMethods[] = {
	{"sayHello","()V",(void*)HelloWorld_sayHello},//bind
};

static int registerNatives(JNIEnv *env)
{
	const char* kclassName = "com/exp/HelloWorld";

	jclass clazz;
	clazz = (*env)->FindClass(env,kclassName);
	if(clazz == NULL)
	{
		return JNI_FALSE;
	}

	if((*env)->RegisterNatives(env,clazz,gMethods,sizeof(gMethods)/sizeof(gMethods[0])) < 0)
	{
		return JNI_FALSE;
	}
	return JNI_TRUE;
}

//重写JNI_OnLoad方法，在方法中调用registerNatives，实现绑定注册
JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm, void * reserved)
{
	JNIEnv * env = NULL;
	jint result = -1;

	if((*vm)->GetEnv(vm,(void**)&env,JNI_VERSION_1_4)!=JNI_OK)
	{
		return -1;
	}

	if(!registerNatives(env))
	{
		return -1;
	}

	result = JNI_VERSION_1_4;

	return result;
}
