package com.microsoft.clarity.models.ingest;

import com.microsoft.clarity.models.BackEndMaskingMode;
import com.microsoft.clarity.models.MaskingMode;
import com.microsoft.clarity.models.MaskingModeAdapter;
import com.microsoft.clarity.models.project.ImageCompressionConfig;
import com.microsoft.clarity.models.project.LowEndDevicesConfig;
import com.microsoft.clarity.models.project.NetworkConfig;
import com.microsoft.clarity.models.project.ScreenCaptureConfig;
import com.microsoft.clarity.models.project.WebViewCaptureConfig;
import com.microsoft.clarity.q.q;
import defpackage.f88;
import defpackage.js3;
import defpackage.yd1;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class IngestConfigs {
    public static final Companion Companion = new Companion(null);
    private final boolean activate;
    private final boolean adsStorage;
    private final boolean analyticsStorage;
    private final ImageCompressionConfig imageCompressionConfigs;
    private final String ingestUrl;
    private final boolean lean;
    private final LowEndDevicesConfig lowEndDevices;
    private final MaskingMode maskingMode;
    private final Set<String> nativeMaskSelectors;
    private final Set<String> nativeUnmaskSelectors;
    private final NetworkConfig network;
    private final String reportUrl;
    private final ScreenCaptureConfig screenCapture;
    private final Set<String> webMaskSelectors;
    private final Set<String> webUnmaskSelectors;
    private final WebViewCaptureConfig webViewCapture;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private final String getReportUrlFromJson(JSONObject jSONObject) throws JSONException {
            if (jSONObject.isNull("reportUrl")) {
                return null;
            }
            String string = jSONObject.getString("reportUrl");
            js3.o(string, "reportUrl");
            if (f88.n0(string)) {
                return null;
            }
            return string;
        }

        public final IngestConfigs fromJson(String str) throws JSONException {
            js3.p(str, "jsonString");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ingestUrl");
            js3.o(string, "json.getString(\"ingestUrl\")");
            String reportUrlFromJson = getReportUrlFromJson(jSONObject);
            boolean z = jSONObject.getBoolean("activate");
            boolean z2 = jSONObject.getBoolean("lean");
            MaskingMode maskingModeFromJson = MaskingModeAdapter.Companion.fromJson(jSONObject.optInt("maskingMode", BackEndMaskingMode.Strict.ordinal()));
            Set setA = q.a(jSONObject.optJSONArray("webMask"));
            Set setA2 = q.a(jSONObject.optJSONArray("webUnmask"));
            Set setA3 = q.a(jSONObject.optJSONArray("nativeMask"));
            Set setA4 = q.a(jSONObject.optJSONArray("nativeUnmask"));
            NetworkConfig.Companion companion = NetworkConfig.Companion;
            JSONObject jSONObject2 = jSONObject.getJSONObject("network");
            js3.o(jSONObject2, "json.getJSONObject(\"network\")");
            NetworkConfig networkConfigFromJson = companion.fromJson(jSONObject2);
            LowEndDevicesConfig.Companion companion2 = LowEndDevicesConfig.Companion;
            JSONObject jSONObject3 = jSONObject.getJSONObject("lowEndDevices");
            js3.o(jSONObject3, "json.getJSONObject(\"lowEndDevices\")");
            LowEndDevicesConfig lowEndDevicesConfigFromJson = companion2.fromJson(jSONObject3);
            WebViewCaptureConfig.Companion companion3 = WebViewCaptureConfig.Companion;
            JSONObject jSONObject4 = jSONObject.getJSONObject("webViewCapture");
            js3.o(jSONObject4, "json.getJSONObject(\"webViewCapture\")");
            WebViewCaptureConfig webViewCaptureConfigFromJson = companion3.fromJson(jSONObject4);
            ScreenCaptureConfig.Companion companion4 = ScreenCaptureConfig.Companion;
            JSONObject jSONObject5 = jSONObject.getJSONObject("screenCapture");
            js3.o(jSONObject5, "json.getJSONObject(\"screenCapture\")");
            ScreenCaptureConfig screenCaptureConfigFromJson = companion4.fromJson(jSONObject5);
            ImageCompressionConfig.Companion companion5 = ImageCompressionConfig.Companion;
            JSONObject jSONObject6 = jSONObject.getJSONObject("imageCompression");
            js3.o(jSONObject6, "json.getJSONObject(\"imageCompression\")");
            return new IngestConfigs(string, reportUrlFromJson, z, z2, maskingModeFromJson, setA, setA2, setA3, setA4, networkConfigFromJson, lowEndDevicesConfigFromJson, webViewCaptureConfigFromJson, screenCaptureConfigFromJson, companion5.fromJson(jSONObject6), jSONObject.optBoolean("adsStorage", false), jSONObject.optBoolean("analyticsStorage", true));
        }

        private Companion() {
        }
    }

    public IngestConfigs(String str, String str2, boolean z, boolean z2, MaskingMode maskingMode, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, NetworkConfig networkConfig, LowEndDevicesConfig lowEndDevicesConfig, WebViewCaptureConfig webViewCaptureConfig, ScreenCaptureConfig screenCaptureConfig, ImageCompressionConfig imageCompressionConfig, boolean z3, boolean z4) {
        js3.p(str, "ingestUrl");
        js3.p(maskingMode, "maskingMode");
        js3.p(set, "webMaskSelectors");
        js3.p(set2, "webUnmaskSelectors");
        js3.p(set3, "nativeMaskSelectors");
        js3.p(set4, "nativeUnmaskSelectors");
        js3.p(networkConfig, "network");
        js3.p(lowEndDevicesConfig, "lowEndDevices");
        js3.p(webViewCaptureConfig, "webViewCapture");
        js3.p(screenCaptureConfig, "screenCapture");
        js3.p(imageCompressionConfig, "imageCompressionConfigs");
        this.ingestUrl = str;
        this.reportUrl = str2;
        this.activate = z;
        this.lean = z2;
        this.maskingMode = maskingMode;
        this.webMaskSelectors = set;
        this.webUnmaskSelectors = set2;
        this.nativeMaskSelectors = set3;
        this.nativeUnmaskSelectors = set4;
        this.network = networkConfig;
        this.lowEndDevices = lowEndDevicesConfig;
        this.webViewCapture = webViewCaptureConfig;
        this.screenCapture = screenCaptureConfig;
        this.imageCompressionConfigs = imageCompressionConfig;
        this.adsStorage = z3;
        this.analyticsStorage = z4;
    }

    public final boolean getActivate() {
        return this.activate;
    }

    public final boolean getAdsStorage() {
        return this.adsStorage;
    }

    public final boolean getAnalyticsStorage() {
        return this.analyticsStorage;
    }

    public final ImageCompressionConfig getImageCompressionConfigs() {
        return this.imageCompressionConfigs;
    }

    public final String getIngestUrl() {
        return this.ingestUrl;
    }

    public final boolean getLean() {
        return this.lean;
    }

    public final LowEndDevicesConfig getLowEndDevices() {
        return this.lowEndDevices;
    }

    public final MaskingMode getMaskingMode() {
        return this.maskingMode;
    }

    public final Set<String> getNativeMaskSelectors() {
        return this.nativeMaskSelectors;
    }

    public final Set<String> getNativeUnmaskSelectors() {
        return this.nativeUnmaskSelectors;
    }

    public final NetworkConfig getNetwork() {
        return this.network;
    }

    public final String getReportUrl() {
        return this.reportUrl;
    }

    public final ScreenCaptureConfig getScreenCapture() {
        return this.screenCapture;
    }

    public final Set<String> getWebMaskSelectors() {
        return this.webMaskSelectors;
    }

    public final Set<String> getWebUnmaskSelectors() {
        return this.webUnmaskSelectors;
    }

    public final WebViewCaptureConfig getWebViewCapture() {
        return this.webViewCapture;
    }

    public /* synthetic */ IngestConfigs(String str, String str2, boolean z, boolean z2, MaskingMode maskingMode, Set set, Set set2, Set set3, Set set4, NetworkConfig networkConfig, LowEndDevicesConfig lowEndDevicesConfig, WebViewCaptureConfig webViewCaptureConfig, ScreenCaptureConfig screenCaptureConfig, ImageCompressionConfig imageCompressionConfig, boolean z3, boolean z4, int i, yd1 yd1Var) {
        this(str, (i & 2) != 0 ? null : str2, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? MaskingMode.Strict : maskingMode, set, set2, set3, set4, networkConfig, lowEndDevicesConfig, webViewCaptureConfig, screenCaptureConfig, imageCompressionConfig, (i & 16384) != 0 ? false : z3, (i & 32768) != 0 ? true : z4);
    }
}
