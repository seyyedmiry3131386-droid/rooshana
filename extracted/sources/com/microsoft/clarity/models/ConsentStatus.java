package com.microsoft.clarity.models;

import defpackage.bl4;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class ConsentStatus {
    private final boolean adsStorage;
    private final boolean analyticsStorage;
    private final ConsentSource source;

    public ConsentStatus(ConsentSource consentSource, boolean z, boolean z2) {
        js3.p(consentSource, "source");
        this.source = consentSource;
        this.adsStorage = z;
        this.analyticsStorage = z2;
    }

    public static /* synthetic */ ConsentStatus copy$default(ConsentStatus consentStatus, ConsentSource consentSource, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            consentSource = consentStatus.source;
        }
        if ((i & 2) != 0) {
            z = consentStatus.adsStorage;
        }
        if ((i & 4) != 0) {
            z2 = consentStatus.analyticsStorage;
        }
        return consentStatus.copy(consentSource, z, z2);
    }

    public final ConsentSource component1() {
        return this.source;
    }

    public final boolean component2() {
        return this.adsStorage;
    }

    public final boolean component3() {
        return this.analyticsStorage;
    }

    public final ConsentStatus copy(ConsentSource consentSource, boolean z, boolean z2) {
        js3.p(consentSource, "source");
        return new ConsentStatus(consentSource, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsentStatus)) {
            return false;
        }
        ConsentStatus consentStatus = (ConsentStatus) obj;
        return this.source == consentStatus.source && this.adsStorage == consentStatus.adsStorage && this.analyticsStorage == consentStatus.analyticsStorage;
    }

    public final boolean getAdsStorage() {
        return this.adsStorage;
    }

    public final boolean getAnalyticsStorage() {
        return this.analyticsStorage;
    }

    public final ConsentSource getSource() {
        return this.source;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.source.hashCode() * 31;
        boolean z = this.adsStorage;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.analyticsStorage;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ConsentStatus(source=");
        sb.append(this.source);
        sb.append(", adsStorage=");
        sb.append(this.adsStorage);
        sb.append(", analyticsStorage=");
        return bl4.A(sb, this.analyticsStorage, ')');
    }
}
