package com.microsoft.clarity.models.ingest;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.f88;
import defpackage.js3;
import defpackage.yd1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PayloadUploadResponse {
    public static final Companion Companion = new Companion(null);
    private final PayloadUploadResponseData data;
    private final boolean successful;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public static /* synthetic */ PayloadUploadResponse create$default(Companion companion, int i, String str, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            return companion.create(i, str);
        }

        public final PayloadUploadResponse create(int i, String str) {
            boolean z = false;
            boolean z2 = i == 200;
            if (200 <= i && i < 300) {
                z = true;
            }
            return new PayloadUploadResponse(z, z2 ? PayloadUploadResponseData.Companion.tryCreate(str) : null, null);
        }

        private Companion() {
        }
    }

    public static final class PayloadUploadResponseData {
        public static final Companion Companion = new Companion(null);
        private final List<PayloadUploadResponseSignal> signals;

        public static final class Companion {
            public /* synthetic */ Companion(yd1 yd1Var) {
                this();
            }

            public final PayloadUploadResponseData tryCreate(String str) throws JSONException {
                yd1 yd1Var = null;
                if (str == null || f88.n0(str)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = f88.y0(str, new String[]{"\n"}, 6).iterator();
                while (it.hasNext()) {
                    List listY0 = f88.y0((String) it.next(), new String[]{" "}, 6);
                    if (listY0.size() == 2) {
                        if (js3.i(listY0.get(0), "SIGNAL")) {
                            JSONArray jSONArray = new JSONArray((String) listY0.get(1));
                            int length = jSONArray.length();
                            for (int i = 0; i < length; i++) {
                                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("type")) {
                                    String string = jSONObjectOptJSONObject.getString("type");
                                    js3.o(string, "signalJson.getString(\"type\")");
                                    arrayList.add(new PayloadUploadResponseSignal(string, jSONObjectOptJSONObject.has(AppMeasurementSdk.ConditionalUserProperty.VALUE) ? jSONObjectOptJSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE) : null));
                                }
                            }
                        }
                    }
                }
                return new PayloadUploadResponseData(arrayList, yd1Var);
            }

            private Companion() {
            }
        }

        public /* synthetic */ PayloadUploadResponseData(List list, yd1 yd1Var) {
            this(list);
        }

        public final List<PayloadUploadResponseSignal> getSignals() {
            return this.signals;
        }

        private PayloadUploadResponseData(List<PayloadUploadResponseSignal> list) {
            this.signals = list;
        }
    }

    public static final class PayloadUploadResponseSignal {
        private final String type;
        private final String value;

        public PayloadUploadResponseSignal(String str, String str2) {
            js3.p(str, "type");
            this.type = str;
            this.value = str2;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ PayloadUploadResponse(boolean z, PayloadUploadResponseData payloadUploadResponseData, yd1 yd1Var) {
        this(z, payloadUploadResponseData);
    }

    public final PayloadUploadResponseData getData() {
        return this.data;
    }

    public final boolean getSuccessful() {
        return this.successful;
    }

    private PayloadUploadResponse(boolean z, PayloadUploadResponseData payloadUploadResponseData) {
        this.successful = z;
        this.data = payloadUploadResponseData;
    }
}
