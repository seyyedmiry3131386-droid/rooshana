package ir.mservices.market.social.mynet.data;

import defpackage.m88;
import defpackage.r22;
import defpackage.yd1;
import ir.mservices.market.app.search.result.data.SearchItemDto;
import java.util.Iterator;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MynetItemType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ MynetItemType[] $VALUES;
    public static final Companion Companion;
    private final String value;
    public static final MynetItemType USERS = new MynetItemType("USERS", 0, "Users");
    public static final MynetItemType USER = new MynetItemType("USER", 1, "User");
    public static final MynetItemType APP_BANNER = new MynetItemType("APP_BANNER", 2, SearchItemDto.APP_BANNER);
    public static final MynetItemType MOVIE_BANNER = new MynetItemType("MOVIE_BANNER", 3, SearchItemDto.MOVIE_BANNER);

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final MynetItemType getByValue(String str) {
            Object next;
            Iterator<E> it = MynetItemType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (m88.T(((MynetItemType) next).getValue(), str, true)) {
                    break;
                }
            }
            return (MynetItemType) next;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ MynetItemType[] $values() {
        return new MynetItemType[]{USERS, USER, APP_BANNER, MOVIE_BANNER};
    }

    static {
        MynetItemType[] mynetItemTypeArr$values = $values();
        $VALUES = mynetItemTypeArr$values;
        $ENTRIES = a.a(mynetItemTypeArr$values);
        Companion = new Companion(null);
    }

    private MynetItemType(String str, int i, String str2) {
        this.value = str2;
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static MynetItemType valueOf(String str) {
        return (MynetItemType) Enum.valueOf(MynetItemType.class, str);
    }

    public static MynetItemType[] values() {
        return (MynetItemType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
