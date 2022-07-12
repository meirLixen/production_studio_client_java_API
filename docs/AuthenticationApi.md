# AuthenticationApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authLogoutGet**](AuthenticationApi.md#authLogoutGet) | **GET** /auth/logout | /auth/logout
[**authSigninPost**](AuthenticationApi.md#authSigninPost) | **POST** /auth/signin | auth/signin
[**authSignupPost**](AuthenticationApi.md#authSignupPost) | **POST** /auth/signup | /auth/signup
[**authUserGet**](AuthenticationApi.md#authUserGet) | **GET** /auth/user | /auth/user
[**loggedGet**](AuthenticationApi.md#loggedGet) | **GET** /logged | /logged
[**verificationEmailGet**](AuthenticationApi.md#verificationEmailGet) | **GET** /verification/email | /verification/email
[**verificationEmailPost**](AuthenticationApi.md#verificationEmailPost) | **POST** /verification/email | /verification/email

<a name="authLogoutGet"></a>
# **authLogoutGet**
> authLogoutGet()

/auth/logout

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.authLogoutGet();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authLogoutGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="authSigninPost"></a>
# **authSigninPost**
> authSigninPost(body)

auth/signin

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
Object body = null; // Object | 
try {
    apiInstance.authSigninPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authSigninPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authSignupPost"></a>
# **authSignupPost**
> authSignupPost(body)

/auth/signup

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
Object body = null; // Object | 
try {
    apiInstance.authSignupPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authSignupPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="authUserGet"></a>
# **authUserGet**
> authUserGet()

/auth/user

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.authUserGet();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#authUserGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="loggedGet"></a>
# **loggedGet**
> loggedGet()

/logged

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    apiInstance.loggedGet();
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#loggedGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verificationEmailGet"></a>
# **verificationEmailGet**
> verificationEmailGet(email, code)

/verification/email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
String email = "email_example"; // String | 
String code = "code_example"; // String | 
try {
    apiInstance.verificationEmailGet(email, code);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#verificationEmailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**|  | [optional]
 **code** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verificationEmailPost"></a>
# **verificationEmailPost**
> verificationEmailPost(body)

/verification/email

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
Object body = null; // Object | 
try {
    apiInstance.verificationEmailPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#verificationEmailPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

