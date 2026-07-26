package com.microsoft.clarity.models.display;

import com.microsoft.clarity.models.observers.ObservedEvent;
import com.microsoft.clarity.models.observers.ScreenMetadata;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class DisallowedScreenDisplayFrame extends ObservedEvent implements IDisplayFrame {
    private final ScreenMetadata screenMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisallowedScreenDisplayFrame(long j, ScreenMetadata screenMetadata) {
        super(j);
        js3.p(screenMetadata, "screenMetadata");
        this.screenMetadata = screenMetadata;
    }

    @Override // com.microsoft.clarity.models.display.IDisplayFrame
    public ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }
}
