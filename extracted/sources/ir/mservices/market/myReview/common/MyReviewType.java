package ir.mservices.market.myReview.common;

import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MyReviewType {
    public static final /* synthetic */ MyReviewType[] c;
    public static final /* synthetic */ r22 d;
    public final int a;
    public final int b;

    static {
        MyReviewType[] myReviewTypeArr = {new MyReviewType("PAGE_UN_REVIEWED", 0, rs6.un_reviewed_apps, rs6.page_name_un_reviewed), new MyReviewType("PAGE_REVIEWED", 1, rs6.reviewed_apps, rs6.page_name_reviewed)};
        c = myReviewTypeArr;
        d = a.a(myReviewTypeArr);
    }

    public MyReviewType(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static MyReviewType valueOf(String str) {
        return (MyReviewType) Enum.valueOf(MyReviewType.class, str);
    }

    public static MyReviewType[] values() {
        return (MyReviewType[]) c.clone();
    }
}
