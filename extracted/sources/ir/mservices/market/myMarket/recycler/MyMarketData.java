package ir.mservices.market.myMarket.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class MyMarketData implements MyketRecyclerData, g32 {
    public static final int e = js6.my_market_row;
    public final int a;
    public final int b;
    public final ItemType c;
    public final boolean d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ItemType {
        public static final ItemType a;
        public static final ItemType b;
        public static final ItemType c;
        public static final ItemType d;
        public static final ItemType e;
        public static final ItemType f;
        public static final ItemType g;
        public static final ItemType h;
        public static final ItemType i;
        public static final ItemType j;
        public static final ItemType k;
        public static final ItemType l;
        public static final ItemType m;
        public static final /* synthetic */ ItemType[] n;

        static {
            ItemType itemType = new ItemType("RECENT_DOWNLOAD", 0);
            a = itemType;
            ItemType itemType2 = new ItemType("SHARE_APP", 1);
            b = itemType2;
            ItemType itemType3 = new ItemType("SECURITY_SHIELD", 2);
            c = itemType3;
            ItemType itemType4 = new ItemType("MOVIE_SUBSCRIPTION", 3);
            d = itemType4;
            ItemType itemType5 = new ItemType("BOOKMARKS", 4);
            e = itemType5;
            ItemType itemType6 = new ItemType("MY_REVIEWS", 5);
            f = itemType6;
            ItemType itemType7 = new ItemType("FEEDBACK", 6);
            g = itemType7;
            ItemType itemType8 = new ItemType("SOCIAL", 7);
            h = itemType8;
            ItemType itemType9 = new ItemType("FINANCIAL", 8);
            i = itemType9;
            ItemType itemType10 = new ItemType("REELS", 9);
            j = itemType10;
            ItemType itemType11 = new ItemType("AD_BLOCK", 10);
            k = itemType11;
            ItemType itemType12 = new ItemType("USAGE_MANAGMENT", 11);
            l = itemType12;
            ItemType itemType13 = new ItemType("PING", 12);
            m = itemType13;
            ItemType[] itemTypeArr = {itemType, itemType2, itemType3, itemType4, itemType5, itemType6, itemType7, itemType8, itemType9, itemType10, itemType11, itemType12, itemType13};
            n = itemTypeArr;
            kotlin.enums.a.a(itemTypeArr);
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) n.clone();
        }
    }

    public MyMarketData(int i, int i2, ItemType itemType, boolean z) {
        js3.p(itemType, "type");
        this.a = i;
        this.b = i2;
        this.c = itemType;
        this.d = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyMarketData)) {
            return false;
        }
        MyMarketData myMarketData = (MyMarketData) obj;
        return this.a == myMarketData.a && this.b == myMarketData.b && this.c == myMarketData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }
}
