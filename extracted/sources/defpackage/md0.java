package defpackage;

import ir.mservices.market.app.bookmark.common.BookmarkType;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class md0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BookmarkType.values().length];
        try {
            BookmarkType[] bookmarkTypeArr = BookmarkType.c;
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
