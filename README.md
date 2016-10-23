# Security
java security
提示BASE64Encoder cannot be resolved to a type
解决办法：
http://liulinxia02.blog.163.com/blog/static/268687720110614346748/
java安全 三种方法的效率
****************************************************************************************
base64 jar：jdk
--------------------------------------------
明文：Idea love code,you know why?
--------------------------------------------
明文加密后的密文:SWRlYSBsb3ZlIGNvZGUseW91IGtub3cgd2h5Pw==
--------------------------------------------
解密加密过的密文：Idea love code,you know why?
-----encodeTimeLenght:0--------------decodeTimeLenght:0-------------------------
****************************************************************************************
base64 jar：commons
--------------------------------------------
明文：Idea love code,you know why?
--------------------------------------------
明文加密后的密文:SWRlYSBsb3ZlIGNvZGUseW91IGtub3cgd2h5Pw==
--------------------------------------------
解密加密过的密文：Idea love code,you know why?
-----encodeTimeLenght:16--------------decodeTimeLenght:0-------------------------
****************************************************************************************
base64 jar：bouncycastle
--------------------------------------------
明文：Idea love code,you know why?
--------------------------------------------
明文加密后的密文:SWRlYSBsb3ZlIGNvZGUseW91IGtub3cgd2h5Pw==
--------------------------------------------
解密加密过的密文：Idea love code,you know why?
-----encodeTimeLenght:137--------------decodeTimeLenght:0-------------------------
