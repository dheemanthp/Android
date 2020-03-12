https://www.hackingnote.com/en/android/concepts

AIDL VS HIDL

AIDL is for IPC within Android Framework
HIDL is for IPC between HAL and Android Framework. Started from Android 8, so HAL no longer needs to recompile to adopt a new version of Android Framework. Android framework and HALs communicate with each other using Binder IPC calls.
Both related to Binder IPC
HIDL HALs guarantee the Android core system/platform(system.img) is backward compatible. Vendors build their images(vendor.img, boot.img) then update them independent of the platform. It is possible to have newer platform version running on the device, vendor images cannot have a newer version than the platform.

***AIDL***

AIDL does nothing but lets the system to generate the boilerplate code that hides the binder IPC details, so that you can invoke the remote service API as a local method call. So,

If you don't need IPC (i.e., your client and server stay in the same process), you don't need AIDL;

If you want to write the boilerplate code yourself for IPC, you don't need AIDL;

If your service is not complicated enough (i.e., does not require concurrent multithreaded accesses), you can use system provided Messenger API for IPC. You don't need your own AIDL, because the Messenger API hides the AIDL usage;

To extend the case 3, if you can use any existing lib or existing API to access a service in another process, you don't need your own AIDL. For example, you can access ActivityManagerService with existing system API, and all the AIDL stuff for IActivityManager is hidden by the system API.

***HIDL***

http://shooting.logdown.com/posts/7798786-aidl-and-hidl

HAL interface definition language or HIDL (pronounced "hide-l") is an interface description language (IDL) to specify the interface between a HAL and its users. It allows specifying types and method calls, collected into interfaces and packages. More broadly, HIDL is a system for communicating between codebases that may be compiled independently.
HIDL is intended to be used for inter-process communication (IPC). Communication between processes is referred to as Binderized.

The goal of HIDL is that the framework can be replaced without having to rebuild HALs. 
HALs will be built by vendors or SOC makers and put in a /vendor partition on the device, 
enabling the framework, in its own partition, to be replaced with an OTA without recompiling the HALs.
