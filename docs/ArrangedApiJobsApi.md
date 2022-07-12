# ArrangedApiJobsApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiJobOfferDelete**](ArrangedApiJobsApi.md#apiJobOfferDelete) | **DELETE** /api/job-offer | delete job
[**apiJobOfferGet**](ArrangedApiJobsApi.md#apiJobOfferGet) | **GET** /api/job-offer | get jobs
[**apiJobOfferPatch**](ArrangedApiJobsApi.md#apiJobOfferPatch) | **PATCH** /api/job-offer | fatch job
[**apiJobOfferPost**](ArrangedApiJobsApi.md#apiJobOfferPost) | **POST** /api/job-offer | create job

<a name="apiJobOfferDelete"></a>
# **apiJobOfferDelete**
> apiJobOfferDelete(id)

delete job

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobsApi;


ArrangedApiJobsApi apiInstance = new ArrangedApiJobsApi();
String id = "id_example"; // String | 
try {
    apiInstance.apiJobOfferDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobsApi#apiJobOfferDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiJobOfferGet"></a>
# **apiJobOfferGet**
> apiJobOfferGet()

get jobs

If you want to get a job offer by ID Add ID param.   Otherwise if you want to get a list of job offers by type Add TYPE param.    Type options:  1.  offers 2.  my 3.  made 4.  crew 5.  received

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobsApi;


ArrangedApiJobsApi apiInstance = new ArrangedApiJobsApi();
try {
    apiInstance.apiJobOfferGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobsApi#apiJobOfferGet");
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

<a name="apiJobOfferPatch"></a>
# **apiJobOfferPatch**
> apiJobOfferPatch(body)

fatch job

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobsApi;


ArrangedApiJobsApi apiInstance = new ArrangedApiJobsApi();
Object body = null; // Object | 
try {
    apiInstance.apiJobOfferPatch(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobsApi#apiJobOfferPatch");
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

<a name="apiJobOfferPost"></a>
# **apiJobOfferPost**
> apiJobOfferPost(body)

create job

*   Create new job in \&quot;jobs\&quot; table *   Look for professionals *   Update professionals found: push job id to jobOffers array in USERS table and email them

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobsApi;


ArrangedApiJobsApi apiInstance = new ArrangedApiJobsApi();
Object body = null; // Object | 
try {
    apiInstance.apiJobOfferPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobsApi#apiJobOfferPost");
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

