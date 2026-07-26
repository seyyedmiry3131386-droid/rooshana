package ir.mservices.market.social.profile.list.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialItemPolicies implements Serializable {

    @vo7("max")
    private final int max;

    @vo7("min")
    private final int min;

    public SocialItemPolicies(int i, int i2) {
        this.min = i;
        this.max = i2;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }
}
