package com.microsoft.clarity.models.observers;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ObservedWebViewEvent extends ObservedEvent {
    public ObservedWebViewEvent(long j) {
        super(j);
    }

    public abstract String getData();

    public abstract String getPageUrl();

    public abstract ScreenMetadata getScreenMetadata();

    public abstract int getType();

    public abstract int getWebViewHashCode();
}
