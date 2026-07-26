package com.microsoft.clarity.models;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import com.microsoft.clarity.models.ingest.IngestConfigs;
import com.microsoft.clarity.models.project.ImageCompressionFormat;
import com.microsoft.clarity.models.project.ScreenNameFilter;
import com.microsoft.clarity.models.project.UrlFilter;
import com.microsoft.clarity.q.l;
import defpackage.dp2;
import defpackage.ew;
import defpackage.f88;
import defpackage.g27;
import defpackage.js3;
import defpackage.m88;
import defpackage.wu0;
import defpackage.yd1;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import org.json.JSONArray;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class DynamicConfig {
    public static final Companion Companion = new Companion(null);
    private final boolean adsStorage;
    private final boolean allowMeteredNetwork;
    private final boolean analyticsStorage;
    private final boolean disableForLowEndDevices;
    private final boolean disableWebViewCapture;
    private final Bitmap.CompressFormat imageCompressionFormat;
    private final int imageCompressionQuality;
    private final String ingestUrl;
    private final boolean isClarityActivated;
    private final boolean leanMode;
    private final Set<String> maskedClasses;
    private final Set<String> maskedFragments;
    private final Set<String> maskedIds;
    private final Set<String> maskedScreens;
    private final List<Integer> maskedViewIds;
    private final MaskingMode maskingMode;
    private final Set<String> nativeMaskSelectors;
    private final Set<String> nativeUnmaskSelectors;
    private final Long networkMaxDailyDataInMB;
    private final SharedPreferences preferences;
    private final int rawImageCompressionFormat;
    private final int rawImageCompressionQuality;
    private final String reportUrl;
    private final List<ScreenNameFilter> screenCaptureAllowedScreens;
    private final List<ScreenNameFilter> screenCaptureDisallowedScreens;
    private final Set<String> unmaskedClasses;
    private final Set<String> unmaskedFragments;
    private final Set<String> unmaskedIds;
    private final Set<String> unmaskedScreens;
    private final List<Integer> unmaskedViewIds;
    private final Set<String> webMaskSelectors;
    private final Set<String> webUnmaskSelectors;
    private final List<UrlFilter> webViewCaptureAllowedUrls;
    private final List<UrlFilter> webViewCaptureDisallowedUrls;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private final String getCachedProjectId(SharedPreferences sharedPreferences) {
            return sharedPreferences.getString("CLARITY_PROJECT_ID", null);
        }

        public final SharedPreferences getPreferences(Context context) {
            js3.p(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("CLARITY_SHARED_PREFERENCES", 0);
            js3.o(sharedPreferences, "context.getSharedPrefere…le, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }

        public final void invalidateCachedConfigsIfNeeded(Context context, String str) {
            js3.p(context, "context");
            js3.p(str, "projectId");
            SharedPreferences preferences = getPreferences(context);
            String cachedProjectId = getCachedProjectId(preferences);
            if (cachedProjectId == null || str.equals(cachedProjectId)) {
                return;
            }
            SharedPreferences.Editor editorEdit = preferences.edit();
            editorEdit.putBoolean("CLARITY_CONFIG_FETCHED", false);
            editorEdit.commit();
        }

        public final boolean isFetched(Context context) {
            js3.p(context, "context");
            return getPreferences(context).getBoolean("CLARITY_CONFIG_FETCHED", false);
        }

        public final void updateSharedPreferences(Context context, String str, IngestConfigs ingestConfigs) {
            js3.p(context, "context");
            js3.p(str, "projectId");
            js3.p(ingestConfigs, "ingestConfigs");
            SharedPreferences.Editor editorEdit = getPreferences(context).edit();
            editorEdit.putBoolean("CLARITY_CONFIG_FETCHED", true);
            editorEdit.putBoolean("CLARITY_ACTIVATED", ingestConfigs.getActivate());
            editorEdit.putString("CLARITY_PROJECT_ID", str);
            editorEdit.putBoolean("LEAN_MODE_ACTIVATED", ingestConfigs.getLean());
            editorEdit.putString("REPORT_URL", ingestConfigs.getReportUrl());
            editorEdit.putString("INGEST_URL", ingestConfigs.getIngestUrl());
            editorEdit.putString("MASKING_MODE", ingestConfigs.getMaskingMode().toString());
            editorEdit.putStringSet("MASKED_WEB_ELEMENTS_LIST", ingestConfigs.getWebMaskSelectors());
            editorEdit.putStringSet("UNMASKED_WEB_ELEMENTS_LIST", ingestConfigs.getWebUnmaskSelectors());
            editorEdit.putStringSet("MASKED_NATIVE_LIST", ingestConfigs.getNativeMaskSelectors());
            editorEdit.putStringSet("UNMASKED_NATIVE_LIST", ingestConfigs.getNativeUnmaskSelectors());
            editorEdit.putBoolean("NETWORK_ALLOW_METERED", ingestConfigs.getNetwork().getAllowMeteredNetwork());
            if (ingestConfigs.getNetwork().getMaxDataVolume() != null) {
                editorEdit.putLong("NETWORK_MAX_DAILY_DATA_VOLUME_MB", ingestConfigs.getNetwork().getMaxDataVolume().longValue());
            } else {
                editorEdit.remove("NETWORK_MAX_DAILY_DATA_VOLUME_MB");
            }
            editorEdit.putBoolean("LOW_END_DEVICES_DISABLE_RECORDINGS", ingestConfigs.getLowEndDevices().getDisableRecordings());
            editorEdit.putBoolean("WEBVIEW_CAPTURE_DISABLED", ingestConfigs.getWebViewCapture().getDisableCapture());
            editorEdit.putString("WEBVIEW_CAPTURE_ALLOWED_URLS", "[" + a.t0(ingestConfigs.getWebViewCapture().getAllowedUrls(), ",", null, null, new dp2() { // from class: com.microsoft.clarity.models.DynamicConfig$Companion$updateSharedPreferences$lambda$1$$inlined$listToString$1
                @Override // defpackage.dp2
                public final CharSequence invoke(UrlFilter urlFilter) {
                    return String.valueOf(urlFilter);
                }

                @Override // defpackage.dp2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((UrlFilter) obj);
                }
            }, 30) + ']');
            editorEdit.putString("WEBVIEW_CAPTURE_DISALLOWED_URLS", "[" + a.t0(ingestConfigs.getWebViewCapture().getDisallowedUrls(), ",", null, null, new dp2() { // from class: com.microsoft.clarity.models.DynamicConfig$Companion$updateSharedPreferences$lambda$1$$inlined$listToString$2
                @Override // defpackage.dp2
                public final CharSequence invoke(UrlFilter urlFilter) {
                    return String.valueOf(urlFilter);
                }

                @Override // defpackage.dp2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((UrlFilter) obj);
                }
            }, 30) + ']');
            editorEdit.putString("SCREEN_CAPTURE_ALLOWED_SCREENS", "[" + a.t0(ingestConfigs.getScreenCapture().getAllowedScreens(), ",", null, null, new dp2() { // from class: com.microsoft.clarity.models.DynamicConfig$Companion$updateSharedPreferences$lambda$1$$inlined$listToString$3
                @Override // defpackage.dp2
                public final CharSequence invoke(ScreenNameFilter screenNameFilter) {
                    return String.valueOf(screenNameFilter);
                }

                @Override // defpackage.dp2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ScreenNameFilter) obj);
                }
            }, 30) + ']');
            editorEdit.putString("SCREEN_CAPTURE_DISALLOWED_SCREENS", "[" + a.t0(ingestConfigs.getScreenCapture().getDisallowedScreens(), ",", null, null, new dp2() { // from class: com.microsoft.clarity.models.DynamicConfig$Companion$updateSharedPreferences$lambda$1$$inlined$listToString$4
                @Override // defpackage.dp2
                public final CharSequence invoke(ScreenNameFilter screenNameFilter) {
                    return String.valueOf(screenNameFilter);
                }

                @Override // defpackage.dp2
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ScreenNameFilter) obj);
                }
            }, 30) + ']');
            editorEdit.putInt("IMAGE_COMPRESSION_FORMAT", ingestConfigs.getImageCompressionConfigs().getFormat().getValue());
            editorEdit.putInt("IMAGE_COMPRESSION_QUALITY", ingestConfigs.getImageCompressionConfigs().getQuality());
            editorEdit.putBoolean("DEFAULT_CONSENT_ADS", ingestConfigs.getAdsStorage());
            editorEdit.putBoolean("DEFAULT_CONSENT_ANALYTICS", ingestConfigs.getAnalyticsStorage());
            editorEdit.apply();
            l.b("Clarity shared preferences updated.");
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MaskingMode.values().length];
            try {
                iArr[MaskingMode.Strict.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MaskingMode.Balanced.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MaskingMode.Relaxed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.util.List<com.microsoft.clarity.models.project.UrlFilter>] */
    /* JADX WARN: Type inference failed for: r11v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.util.List<com.microsoft.clarity.models.project.UrlFilter>] */
    /* JADX WARN: Type inference failed for: r11v23, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v24, types: [java.util.List<com.microsoft.clarity.models.project.ScreenNameFilter>] */
    /* JADX WARN: Type inference failed for: r11v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.util.List<com.microsoft.clarity.models.project.ScreenNameFilter>] */
    /* JADX WARN: Type inference failed for: r11v46, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v47, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v50, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v54, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v58, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v59, types: [java.util.ArrayList] */
    public DynamicConfig(Context context) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        Bitmap.CompressFormat compressFormat;
        js3.p(context, "context");
        Companion companion = Companion;
        SharedPreferences preferences = companion.getPreferences(context);
        this.preferences = preferences;
        if (!companion.isFetched(context)) {
            throw new IllegalStateException("Dynamic config has not been fetched yet!");
        }
        String string = preferences.getString("MASKING_MODE", "Strict");
        this.maskingMode = MaskingMode.valueOf(string != null ? string : "Strict");
        Set<String> set = EmptySet.a;
        Set<String> stringSet = preferences.getStringSet("MASKED_WEB_ELEMENTS_LIST", set);
        this.webMaskSelectors = stringSet == null ? set : stringSet;
        Set<String> stringSet2 = preferences.getStringSet("UNMASKED_WEB_ELEMENTS_LIST", set);
        this.webUnmaskSelectors = stringSet2 == null ? set : stringSet2;
        Set<String> stringSet3 = preferences.getStringSet("MASKED_NATIVE_LIST", set);
        stringSet3 = stringSet3 == null ? set : stringSet3;
        this.nativeMaskSelectors = stringSet3;
        Set<String> stringSet4 = preferences.getStringSet("UNMASKED_NATIVE_LIST", set);
        this.nativeUnmaskSelectors = stringSet4 != null ? stringSet4 : set;
        this.rawImageCompressionFormat = preferences.getInt("IMAGE_COMPRESSION_FORMAT", ImageCompressionFormat.Unknown.getValue());
        this.rawImageCompressionQuality = preferences.getInt("IMAGE_COMPRESSION_QUALITY", 0);
        this.leanMode = preferences.getBoolean("LEAN_MODE_ACTIVATED", false);
        this.isClarityActivated = preferences.getBoolean("CLARITY_ACTIVATED", false);
        String string2 = preferences.getString("INGEST_URL", "https://www.clarity.ms/eus2/");
        this.ingestUrl = string2 != null ? string2 : "https://www.clarity.ms/eus2/";
        this.reportUrl = preferences.getString("REPORT_URL", null);
        ArrayList<String> arrayList5 = new ArrayList();
        for (Object obj : stringSet3) {
            String str = (String) obj;
            js3.o(str, "it");
            if (m88.Z(str, ".", false)) {
                arrayList5.add(obj);
            }
        }
        ArrayList arrayList6 = new ArrayList(wu0.V(arrayList5, 10));
        for (String str2 : arrayList5) {
            js3.o(str2, "it");
            arrayList6.add(f88.e0(1, str2));
        }
        this.maskedClasses = a.T0(arrayList6);
        Set<String> set2 = this.nativeUnmaskSelectors;
        ArrayList<String> arrayList7 = new ArrayList();
        for (Object obj2 : set2) {
            String str3 = (String) obj2;
            js3.o(str3, "it");
            if (m88.Z(str3, ".", false)) {
                arrayList7.add(obj2);
            }
        }
        ArrayList arrayList8 = new ArrayList(wu0.V(arrayList7, 10));
        for (String str4 : arrayList7) {
            js3.o(str4, "it");
            arrayList8.add(f88.e0(1, str4));
        }
        this.unmaskedClasses = a.T0(arrayList8);
        Set<String> set3 = this.nativeMaskSelectors;
        ArrayList<String> arrayList9 = new ArrayList();
        for (Object obj3 : set3) {
            String str5 = (String) obj3;
            js3.o(str5, "it");
            if (m88.Z(str5, "&", false)) {
                arrayList9.add(obj3);
            }
        }
        ArrayList arrayList10 = new ArrayList(wu0.V(arrayList9, 10));
        for (String str6 : arrayList9) {
            js3.o(str6, "it");
            arrayList10.add(f88.e0(1, str6));
        }
        this.maskedScreens = a.T0(arrayList10);
        Set<String> set4 = this.nativeUnmaskSelectors;
        ArrayList<String> arrayList11 = new ArrayList();
        for (Object obj4 : set4) {
            String str7 = (String) obj4;
            js3.o(str7, "it");
            if (m88.Z(str7, "&", false)) {
                arrayList11.add(obj4);
            }
        }
        ArrayList arrayList12 = new ArrayList(wu0.V(arrayList11, 10));
        for (String str8 : arrayList11) {
            js3.o(str8, "it");
            arrayList12.add(f88.e0(1, str8));
        }
        this.unmaskedScreens = a.T0(arrayList12);
        Set<String> set5 = this.nativeMaskSelectors;
        ArrayList<String> arrayList13 = new ArrayList();
        for (Object obj5 : set5) {
            String str9 = (String) obj5;
            js3.o(str9, "it");
            if (m88.Z(str9, Marker.ANY_MARKER, false)) {
                arrayList13.add(obj5);
            }
        }
        ArrayList arrayList14 = new ArrayList(wu0.V(arrayList13, 10));
        for (String str10 : arrayList13) {
            js3.o(str10, "it");
            arrayList14.add(f88.e0(1, str10));
        }
        this.maskedFragments = a.T0(arrayList14);
        Set<String> set6 = this.nativeUnmaskSelectors;
        ArrayList<String> arrayList15 = new ArrayList();
        for (Object obj6 : set6) {
            String str11 = (String) obj6;
            js3.o(str11, "it");
            if (m88.Z(str11, Marker.ANY_MARKER, false)) {
                arrayList15.add(obj6);
            }
        }
        ArrayList arrayList16 = new ArrayList(wu0.V(arrayList15, 10));
        for (String str12 : arrayList15) {
            js3.o(str12, "it");
            arrayList16.add(f88.e0(1, str12));
        }
        this.unmaskedFragments = a.T0(arrayList16);
        Set<String> set7 = this.nativeMaskSelectors;
        ArrayList<String> arrayList17 = new ArrayList();
        for (Object obj7 : set7) {
            String str13 = (String) obj7;
            js3.o(str13, "it");
            if (m88.Z(str13, "#", false)) {
                arrayList17.add(obj7);
            }
        }
        ArrayList arrayList18 = new ArrayList(wu0.V(arrayList17, 10));
        for (String str14 : arrayList17) {
            js3.o(str14, "it");
            arrayList18.add(f88.e0(1, str14));
        }
        this.maskedIds = a.T0(arrayList18);
        Set<String> set8 = this.nativeUnmaskSelectors;
        ArrayList<String> arrayList19 = new ArrayList();
        for (Object obj8 : set8) {
            String str15 = (String) obj8;
            js3.o(str15, "it");
            if (m88.Z(str15, "#", false)) {
                arrayList19.add(obj8);
            }
        }
        ArrayList arrayList20 = new ArrayList(wu0.V(arrayList19, 10));
        for (String str16 : arrayList19) {
            js3.o(str16, "it");
            arrayList20.add(f88.e0(1, str16));
        }
        this.unmaskedIds = a.T0(arrayList20);
        Set<String> set9 = this.maskedIds;
        ArrayList arrayList21 = new ArrayList(wu0.V(set9, 10));
        Iterator it = set9.iterator();
        while (it.hasNext()) {
            arrayList21.add(Integer.valueOf(context.getResources().getIdentifier((String) it.next(), "id", context.getPackageName())));
        }
        ArrayList arrayList22 = new ArrayList();
        for (Object obj9 : arrayList21) {
            if (((Number) obj9).intValue() != 0) {
                arrayList22.add(obj9);
            }
        }
        this.maskedViewIds = arrayList22;
        Set<String> set10 = this.unmaskedIds;
        ArrayList arrayList23 = new ArrayList(wu0.V(set10, 10));
        Iterator it2 = set10.iterator();
        while (it2.hasNext()) {
            arrayList23.add(Integer.valueOf(context.getResources().getIdentifier((String) it2.next(), "id", context.getPackageName())));
        }
        ArrayList arrayList24 = new ArrayList();
        for (Object obj10 : arrayList23) {
            if (((Number) obj10).intValue() != 0) {
                arrayList24.add(obj10);
            }
        }
        this.unmaskedViewIds = arrayList24;
        this.allowMeteredNetwork = this.preferences.getBoolean("NETWORK_ALLOW_METERED", false);
        this.networkMaxDailyDataInMB = this.preferences.contains("NETWORK_MAX_DAILY_DATA_VOLUME_MB") ? Long.valueOf(this.preferences.getLong("NETWORK_MAX_DAILY_DATA_VOLUME_MB", 0L)) : null;
        this.disableForLowEndDevices = this.preferences.getBoolean("LOW_END_DEVICES_DISABLE_RECORDINGS", false);
        this.disableWebViewCapture = this.preferences.getBoolean("WEBVIEW_CAPTURE_DISABLED", false);
        if (this.preferences.contains("WEBVIEW_CAPTURE_ALLOWED_URLS")) {
            String string3 = this.preferences.getString("WEBVIEW_CAPTURE_ALLOWED_URLS", null);
            UrlFilter.Companion companion2 = UrlFilter.Companion;
            if (string3 == null) {
                arrayList = new ArrayList();
            } else {
                JSONArray jSONArray = new JSONArray(string3);
                arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string4 = jSONArray.getJSONObject(i).toString();
                    js3.o(string4, "it.getJSONObject(i).toString()");
                    arrayList.add(companion2.fromJson(string4));
                }
            }
        } else {
            arrayList = EmptyList.a;
        }
        this.webViewCaptureAllowedUrls = arrayList;
        if (this.preferences.contains("WEBVIEW_CAPTURE_DISALLOWED_URLS")) {
            String string5 = this.preferences.getString("WEBVIEW_CAPTURE_DISALLOWED_URLS", null);
            UrlFilter.Companion companion3 = UrlFilter.Companion;
            if (string5 == null) {
                arrayList2 = new ArrayList();
            } else {
                JSONArray jSONArray2 = new JSONArray(string5);
                arrayList2 = new ArrayList();
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    String string6 = jSONArray2.getJSONObject(i2).toString();
                    js3.o(string6, "it.getJSONObject(i).toString()");
                    arrayList2.add(companion3.fromJson(string6));
                }
            }
        } else {
            arrayList2 = EmptyList.a;
        }
        this.webViewCaptureDisallowedUrls = arrayList2;
        if (this.preferences.contains("SCREEN_CAPTURE_ALLOWED_SCREENS")) {
            String string7 = this.preferences.getString("SCREEN_CAPTURE_ALLOWED_SCREENS", null);
            ScreenNameFilter.Companion companion4 = ScreenNameFilter.Companion;
            if (string7 == null) {
                arrayList3 = new ArrayList();
            } else {
                JSONArray jSONArray3 = new JSONArray(string7);
                arrayList3 = new ArrayList();
                int length3 = jSONArray3.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    String string8 = jSONArray3.getJSONObject(i3).toString();
                    js3.o(string8, "it.getJSONObject(i).toString()");
                    arrayList3.add(companion4.fromJson(string8));
                }
            }
        } else {
            arrayList3 = EmptyList.a;
        }
        this.screenCaptureAllowedScreens = arrayList3;
        if (this.preferences.contains("SCREEN_CAPTURE_DISALLOWED_SCREENS")) {
            String string9 = this.preferences.getString("SCREEN_CAPTURE_DISALLOWED_SCREENS", null);
            ScreenNameFilter.Companion companion5 = ScreenNameFilter.Companion;
            if (string9 == null) {
                arrayList4 = new ArrayList();
            } else {
                JSONArray jSONArray4 = new JSONArray(string9);
                arrayList4 = new ArrayList();
                int length4 = jSONArray4.length();
                for (int i4 = 0; i4 < length4; i4++) {
                    String string10 = jSONArray4.getJSONObject(i4).toString();
                    js3.o(string10, "it.getJSONObject(i).toString()");
                    arrayList4.add(companion5.fromJson(string10));
                }
            }
        } else {
            arrayList4 = EmptyList.a;
        }
        this.screenCaptureDisallowedScreens = arrayList4;
        int i5 = this.rawImageCompressionFormat;
        if (i5 == ImageCompressionFormat.Unknown.getValue() || i5 == ImageCompressionFormat.PNG.getValue()) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            if (i5 != ImageCompressionFormat.WEBP_LOSSY.getValue()) {
                throw new IllegalArgumentException("Unexpected image compression format");
            }
            compressFormat = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.PNG;
        }
        this.imageCompressionFormat = compressFormat;
        int i6 = this.rawImageCompressionQuality;
        this.imageCompressionQuality = i6 <= 0 ? 100 : i6;
        this.adsStorage = this.preferences.getBoolean("DEFAULT_CONSENT_ADS", false);
        this.analyticsStorage = this.preferences.getBoolean("DEFAULT_CONSENT_ANALYTICS", true);
    }

    public final boolean getAdsStorage() {
        return this.adsStorage;
    }

    public final boolean getAllowMeteredNetwork() {
        return this.allowMeteredNetwork;
    }

    public final boolean getAnalyticsStorage() {
        return this.analyticsStorage;
    }

    public final boolean getDisableForLowEndDevices() {
        return this.disableForLowEndDevices;
    }

    public final boolean getDisableWebViewCapture() {
        return this.disableWebViewCapture;
    }

    public final Bitmap.CompressFormat getImageCompressionFormat() {
        return this.imageCompressionFormat;
    }

    public final int getImageCompressionQuality() {
        return this.imageCompressionQuality;
    }

    public final String getIngestUrl() {
        return this.ingestUrl;
    }

    public final boolean getLeanMode() {
        return this.leanMode;
    }

    public final Set<String> getMaskedClasses() {
        return this.maskedClasses;
    }

    public final Set<String> getMaskedFragments() {
        return this.maskedFragments;
    }

    public final Set<String> getMaskedIds() {
        return this.maskedIds;
    }

    public final Set<String> getMaskedScreens() {
        return this.maskedScreens;
    }

    public final List<Integer> getMaskedViewIds() {
        return this.maskedViewIds;
    }

    public final MaskingMode getMaskingMode() {
        return this.maskingMode;
    }

    public final Long getNetworkMaxDailyDataInMB() {
        return this.networkMaxDailyDataInMB;
    }

    public final String getReportUrl() {
        return this.reportUrl;
    }

    public final List<ScreenNameFilter> getScreenCaptureAllowedScreens() {
        return this.screenCaptureAllowedScreens;
    }

    public final List<ScreenNameFilter> getScreenCaptureDisallowedScreens() {
        return this.screenCaptureDisallowedScreens;
    }

    public final Set<String> getUnmaskedClasses() {
        return this.unmaskedClasses;
    }

    public final Set<String> getUnmaskedFragments() {
        return this.unmaskedFragments;
    }

    public final Set<String> getUnmaskedIds() {
        return this.unmaskedIds;
    }

    public final Set<String> getUnmaskedScreens() {
        return this.unmaskedScreens;
    }

    public final List<Integer> getUnmaskedViewIds() {
        return this.unmaskedViewIds;
    }

    public final Set<String> getWebMaskSelectors() {
        return this.webMaskSelectors;
    }

    public final Set<String> getWebUnmaskSelectors() {
        return this.webUnmaskSelectors;
    }

    public final List<UrlFilter> getWebViewCaptureAllowedUrls() {
        return this.webViewCaptureAllowedUrls;
    }

    public final List<UrlFilter> getWebViewCaptureDisallowedUrls() {
        return this.webViewCaptureDisallowedUrls;
    }

    public final boolean isAllowedActivity(Activity activity2, boolean z) {
        js3.p(activity2, "activity");
        if (z) {
            return true;
        }
        Set setB1 = ew.b1(new String[]{activity2.getClass().getName(), g27.a(activity2.getClass()).d()});
        List<ScreenNameFilter> list = this.screenCaptureDisallowedScreens;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (setB1.contains(((ScreenNameFilter) it.next()).getScreenName())) {
                    return false;
                }
            }
        }
        if (this.screenCaptureAllowedScreens.isEmpty()) {
            return true;
        }
        List<ScreenNameFilter> list2 = this.screenCaptureAllowedScreens;
        if (list2 != null && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            if (setB1.contains(((ScreenNameFilter) it2.next()).getScreenName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isAllowedUrl(String str) {
        js3.p(str, "urlString");
        List<UrlFilter> list = this.webViewCaptureDisallowedUrls;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((UrlFilter) it.next()).matches(str)) {
                    return false;
                }
            }
        }
        URL url = null;
        try {
            if (!str.equals("about:blank")) {
                url = new URL(str);
            }
        } catch (Exception e) {
            l.e("Failed to parse URL " + str + " because of " + e + '.');
        }
        if (url == null) {
            return true;
        }
        String host = url.getHost();
        if (!js3.i(url.getProtocol(), "file") && !js3.i(host, "appassets.androidplatform.net") && !js3.i(host, "localhost") && !this.webViewCaptureAllowedUrls.isEmpty()) {
            List<UrlFilter> list2 = this.webViewCaptureAllowedUrls;
            if (list2 != null && list2.isEmpty()) {
                return false;
            }
            for (UrlFilter urlFilter : list2) {
                if (js3.i(urlFilter.getUrl(), Marker.ANY_MARKER) || urlFilter.matches(str)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean isClarityActivated() {
        return this.isClarityActivated;
    }

    public final boolean isMaskedActivity(Activity activity2, boolean z) {
        js3.p(activity2, "activity");
        if (z) {
            return false;
        }
        Set setB1 = ew.b1(new String[]{activity2.getClass().getName(), g27.a(activity2.getClass()).d()});
        int i = WhenMappings.$EnumSwitchMapping$0[this.maskingMode.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Set<String> set = this.maskedScreens;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (setB1.contains((String) it.next())) {
                }
            }
            return false;
        }
        Set<String> set2 = this.unmaskedScreens;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator<T> it2 = set2.iterator();
            while (it2.hasNext()) {
                if (setB1.contains((String) it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
