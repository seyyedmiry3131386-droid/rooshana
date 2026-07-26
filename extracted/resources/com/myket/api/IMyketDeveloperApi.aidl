package com.myket.api;

// Declare any non-default types here with import statements

// TODO Put documents in this file, like the IInAppBillingService.aidl file. Because we give this file to developers and it would be a source for our API documents.
// TODO Move this file to a better names package. It's not needed to be near IInAppBillingService.aidl file.
interface IMyketDeveloperApi {
    int isDeveloperApiSupported(int apiVersion);

    Bundle getAppUpdateState(int apiVersion, String packageName);

    int isUserLogin(int apiVersion);

    Bundle getAccountInfo(int apiVersion, String packageName);

    Bundle saveData(int apiVersion, String packageName, String payload);

    Bundle loadData(int apiVersion, String packageName);
}
