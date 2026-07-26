package com.microsoft.clarity.models.observers;

import com.microsoft.clarity.models.ingest.EventType;
import defpackage.bp2;
import defpackage.c24;
import defpackage.f88;
import defpackage.js3;
import defpackage.ok4;
import defpackage.yd1;
import kotlin.a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class SerializedWebViewEvent extends ObservedWebViewEvent {
    public static final Companion Companion = new Companion(null);
    private final String data;
    private final c24 json$delegate;
    private final ScreenMetadata screenMetadata;
    private final int webViewHashCode;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final SerializedWebViewEvent create(String str, ScreenMetadata screenMetadata, int i) {
            js3.p(str, "data");
            js3.p(screenMetadata, "screenMetadata");
            return new SerializedWebViewEvent(str, Long.parseLong(f88.B0(str, ok4.Z(f88.k0('[', 0, 6, str) + 1, f88.k0(',', 0, 6, str)))), screenMetadata, i, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SerializedWebViewEvent(String str, long j, ScreenMetadata screenMetadata, int i, yd1 yd1Var) {
        this(str, j, screenMetadata, i);
    }

    private final JSONArray getJson() {
        return (JSONArray) this.json$delegate.getValue();
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public String getData() {
        return this.data;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public String getPageUrl() throws JSONException, IllegalAccessException {
        if (isAnalyticsEvent()) {
            throw new IllegalAccessException("Page Url is not available for analytics events!");
        }
        String string = getJson().getString(5);
        js3.o(string, "json.getString(5)");
        return string;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public int getType() {
        return getJson().getInt(1);
    }

    @Override // com.microsoft.clarity.models.observers.ObservedWebViewEvent
    public int getWebViewHashCode() {
        return this.webViewHashCode;
    }

    public final boolean isAnalyticsEvent() {
        return (getType() == EventType.WebViewDiscover.getCustomOrdinal() || getType() == EventType.WebViewMutation.getCustomOrdinal() || getType() == EventType.StyleSheetAdoption.getCustomOrdinal() || getType() == EventType.StyleSheetUpdate.getCustomOrdinal()) ? false : true;
    }

    private SerializedWebViewEvent(String str, long j, ScreenMetadata screenMetadata, int i) {
        super(j);
        this.data = str;
        this.screenMetadata = screenMetadata;
        this.webViewHashCode = i;
        this.json$delegate = a.a(new bp2() { // from class: com.microsoft.clarity.models.observers.SerializedWebViewEvent$json$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final JSONArray invoke() {
                return new JSONArray(this.this$0.getData());
            }
        });
    }
}
