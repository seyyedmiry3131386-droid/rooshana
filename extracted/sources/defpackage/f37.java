package defpackage;

import ir.mservices.market.social.profile.data.Relation;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f37 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Relation.values().length];
        try {
            iArr[Relation.FOLLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Relation.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Relation.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
