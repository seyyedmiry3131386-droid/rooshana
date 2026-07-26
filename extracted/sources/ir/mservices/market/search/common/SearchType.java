package ir.mservices.market.search.common;

import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SearchType {
    public static final SearchType b;
    public static final /* synthetic */ SearchType[] c;
    public static final /* synthetic */ r22 d;
    public final int a;

    static {
        SearchType searchType = new SearchType("APP", 0, rs6.search_tab_app);
        b = searchType;
        SearchType[] searchTypeArr = {searchType, new SearchType("MOVIE", 1, rs6.search_tab_movie)};
        c = searchTypeArr;
        d = a.a(searchTypeArr);
    }

    public SearchType(String str, int i, int i2) {
        this.a = i2;
    }

    public static SearchType valueOf(String str) {
        return (SearchType) Enum.valueOf(SearchType.class, str);
    }

    public static SearchType[] values() {
        return (SearchType[]) c.clone();
    }
}
