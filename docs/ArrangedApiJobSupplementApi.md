# ArrangedApiJobSupplementApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**newApiJobJobOffersConfirmOfferPost**](ArrangedApiJobSupplementApi.md#newApiJobJobOffersConfirmOfferPost) | **POST** /new-api/job/job-offers-confirm-offer | job-offers-confirm-offer
[**newApiJobJobOffersRequestCancelationPost**](ArrangedApiJobSupplementApi.md#newApiJobJobOffersRequestCancelationPost) | **POST** /new-api/job/job-offers-request-cancelation | job-offers-request-cancelation
[**newApiJobLoadManagePostsGet**](ArrangedApiJobSupplementApi.md#newApiJobLoadManagePostsGet) | **GET** /new-api/job/load-manage-posts | load-manage-posts
[**newApiJobLoadManagePostsSingleGet**](ArrangedApiJobSupplementApi.md#newApiJobLoadManagePostsSingleGet) | **GET** /new-api/job/load-manage-posts-single | load-manage-posts-single
[**newApiJobLoadMyCrewPostsGet**](ArrangedApiJobSupplementApi.md#newApiJobLoadMyCrewPostsGet) | **GET** /new-api/job/load-my-crew-posts | load-my-crew-posts
[**newApiJobManageCrewAcceptUserRemovalRequestPost**](ArrangedApiJobSupplementApi.md#newApiJobManageCrewAcceptUserRemovalRequestPost) | **POST** /new-api/job/manage-crew-accept-user-removal-request | manage-crew-accept-user-removal-request
[**newApiJobManageCrewRequestUserRemovalPost**](ArrangedApiJobSupplementApi.md#newApiJobManageCrewRequestUserRemovalPost) | **POST** /new-api/job/manage-crew-request-user-removal | manage-crew-request-user-removal

<a name="newApiJobJobOffersConfirmOfferPost"></a>
# **newApiJobJobOffersConfirmOfferPost**
> newApiJobJobOffersConfirmOfferPost(body)

job-offers-confirm-offer

*   (jobs table) find job by id. *   (jobcrews table) find job-crew by id and set \&quot;userConfirmAccept\&quot; to \&quot;true\&quot; and \&quot;confirmedAt\&quot; to current date. *   (user table) find user and push job id to \&quot;dismissedJobOffers\&quot; array. *   (jobpriceoffers table) find job price offer and set \&quot;hideOffer\&quot; to \&quot;true\&quot;. *   create notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
Object body = null; // Object | 
try {
    apiInstance.newApiJobJobOffersConfirmOfferPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobJobOffersConfirmOfferPost");
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

<a name="newApiJobJobOffersRequestCancelationPost"></a>
# **newApiJobJobOffersRequestCancelationPost**
> newApiJobJobOffersRequestCancelationPost(body)

job-offers-request-cancelation

*   (jobcrews table) find job-crew by id and set \&quot;userRequestRemoval\&quot; to true. *   create notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
Object body = null; // Object | 
try {
    apiInstance.newApiJobJobOffersRequestCancelationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobJobOffersRequestCancelationPost");
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

<a name="newApiJobLoadManagePostsGet"></a>
# **newApiJobLoadManagePostsGet**
> newApiJobLoadManagePostsGet(showArchive, sort)

load-manage-posts

get my jobs where crewFull &#x3D; false and \&quot;dates.to\&quot; until the current date

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
Boolean showArchive = true; // Boolean | 
Integer sort = 56; // Integer | 
try {
    apiInstance.newApiJobLoadManagePostsGet(showArchive, sort);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobLoadManagePostsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **showArchive** | **Boolean**|  | [optional]
 **sort** | **Integer**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newApiJobLoadManagePostsSingleGet"></a>
# **newApiJobLoadManagePostsSingleGet**
> newApiJobLoadManagePostsSingleGet(jobId)

load-manage-posts-single

get job by id and set hasSeen &#x3D; true

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
String jobId = "jobId_example"; // String | 
try {
    apiInstance.newApiJobLoadManagePostsSingleGet(jobId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobLoadManagePostsSingleGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newApiJobLoadMyCrewPostsGet"></a>
# **newApiJobLoadMyCrewPostsGet**
> newApiJobLoadMyCrewPostsGet()

load-my-crew-posts

get my \&quot;jobcrews\&quot; where userConfirmAccept &#x3D; true

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
try {
    apiInstance.newApiJobLoadMyCrewPostsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobLoadMyCrewPostsGet");
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

<a name="newApiJobManageCrewAcceptUserRemovalRequestPost"></a>
# **newApiJobManageCrewAcceptUserRemovalRequestPost**
> newApiJobManageCrewAcceptUserRemovalRequestPost(body)

manage-crew-accept-user-removal-request

*   (jobcrews table) find job-crew by id. *   (jobpriceoffers table) delete his job-price-offer. *   (job table) find his job by id and remove job-crew from crew array. *   (user table) find user and remove job from jobOffers *   array. and push job to dismissedJobOffers array. *   (jobcrews table) delete job-crew. *   send notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
Object body = null; // Object | 
try {
    apiInstance.newApiJobManageCrewAcceptUserRemovalRequestPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobManageCrewAcceptUserRemovalRequestPost");
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

<a name="newApiJobManageCrewRequestUserRemovalPost"></a>
# **newApiJobManageCrewRequestUserRemovalPost**
> newApiJobManageCrewRequestUserRemovalPost(body)

manage-crew-request-user-removal

(jobcrews table) find job-crew by id, and set ownerRequestRemoval to true, and if \&quot;action\&quot; key set to \&quot;onlyRemove\&quot; set \&quot;openJobAfterRemove\&quot; to \&quot;false\&quot; else set it to \&quot;true\&quot;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobSupplementApi;


ArrangedApiJobSupplementApi apiInstance = new ArrangedApiJobSupplementApi();
Object body = null; // Object | 
try {
    apiInstance.newApiJobManageCrewRequestUserRemovalPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobSupplementApi#newApiJobManageCrewRequestUserRemovalPost");
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

