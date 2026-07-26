package ir.mservices.market.app.bookmark.common;

import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkType {
    public static final /* synthetic */ BookmarkType[] c;
    public static final /* synthetic */ r22 d;
    public final int a;
    public final int b;

    static {
        BookmarkType[] bookmarkTypeArr = {new BookmarkType("APPS", 0, rs6.bookmerked_app, rs6.page_name_app_bookmark), new BookmarkType("MOVIES", 1, rs6.bookmerked_movie, rs6.page_name_movie_bookmark)};
        c = bookmarkTypeArr;
        d = a.a(bookmarkTypeArr);
    }

    public BookmarkType(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static BookmarkType valueOf(String str) {
        return (BookmarkType) Enum.valueOf(BookmarkType.class, str);
    }

    public static BookmarkType[] values() {
        return (BookmarkType[]) c.clone();
    }
}
