package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public enum RequestCoordinator$RequestState {
    RUNNING(false),
    PAUSED(false),
    CLEARED(false),
    SUCCESS(true),
    FAILED(true);

    public final boolean a;

    RequestCoordinator$RequestState(boolean z) {
        this.a = z;
    }
}
