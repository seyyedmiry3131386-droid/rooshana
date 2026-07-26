package com.microsoft.clarity.models;

import com.microsoft.clarity.models.SessionMetadata;
import defpackage.dw1;
import defpackage.js3;
import defpackage.yd1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class PageMetadata {
    public static final Companion Companion = new Companion(null);
    private final int pageNum;
    private final SessionMetadata sessionMetadata;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final PageMetadata fromJson(String str) throws JSONException {
            js3.p(str, "jsoString");
            JSONObject jSONObject = new JSONObject(str);
            SessionMetadata.Companion companion = SessionMetadata.Companion;
            String string = jSONObject.getString("sessionMetadata");
            js3.o(string, "json.getString(\"sessionMetadata\")");
            return new PageMetadata(companion.fromJson(string), jSONObject.getInt("pageNum"));
        }

        private Companion() {
        }
    }

    public PageMetadata(SessionMetadata sessionMetadata, int i) {
        js3.p(sessionMetadata, "sessionMetadata");
        this.sessionMetadata = sessionMetadata;
        this.pageNum = i;
    }

    public static /* synthetic */ PageMetadata copy$default(PageMetadata pageMetadata, SessionMetadata sessionMetadata, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sessionMetadata = pageMetadata.sessionMetadata;
        }
        if ((i2 & 2) != 0) {
            i = pageMetadata.pageNum;
        }
        return pageMetadata.copy(sessionMetadata, i);
    }

    public final SessionMetadata component1() {
        return this.sessionMetadata;
    }

    public final int component2() {
        return this.pageNum;
    }

    public final PageMetadata copy(SessionMetadata sessionMetadata, int i) {
        js3.p(sessionMetadata, "sessionMetadata");
        return new PageMetadata(sessionMetadata, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PageMetadata)) {
            return false;
        }
        PageMetadata pageMetadata = (PageMetadata) obj;
        return js3.i(this.sessionMetadata, pageMetadata.sessionMetadata) && this.pageNum == pageMetadata.pageNum;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final SessionMetadata getSessionMetadata() {
        return this.sessionMetadata;
    }

    public int hashCode() {
        return this.pageNum + (this.sessionMetadata.hashCode() * 31);
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sessionMetadata", this.sessionMetadata.toJson());
        jSONObject.put("pageNum", this.pageNum);
        String string = jSONObject.toString();
        js3.o(string, "json.toString()");
        return string;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PageMetadata(sessionMetadata=");
        sb.append(this.sessionMetadata);
        sb.append(", pageNum=");
        return dw1.q(sb, this.pageNum, ')');
    }
}
