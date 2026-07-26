package ir.mservices.market.myAccount;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class MyAccountItemsType {
    public static final MyAccountItemsType b;
    public static final MyAccountItemsType c;
    public static final MyAccountItemsType d;
    public static final MyAccountItemsType e;
    public static final MyAccountItemsType f;
    public static final MyAccountItemsType g;
    public static final MyAccountItemsType h;
    public static final MyAccountItemsType i;
    public static final MyAccountItemsType j;
    public static final MyAccountItemsType k;
    public static final /* synthetic */ MyAccountItemsType[] l;
    public final String a;

    static {
        MyAccountItemsType myAccountItemsType = new MyAccountItemsType("AVATAR", 0, "avatar");
        b = myAccountItemsType;
        MyAccountItemsType myAccountItemsType2 = new MyAccountItemsType("NAME", 1, "nickname");
        c = myAccountItemsType2;
        MyAccountItemsType myAccountItemsType3 = new MyAccountItemsType("BIO", 2, "bio");
        d = myAccountItemsType3;
        MyAccountItemsType myAccountItemsType4 = new MyAccountItemsType("GENDER", 3, "gender");
        e = myAccountItemsType4;
        MyAccountItemsType myAccountItemsType5 = new MyAccountItemsType("CITY", 4, "city");
        f = myAccountItemsType5;
        MyAccountItemsType myAccountItemsType6 = new MyAccountItemsType("BIRTHDAY", 5, "birthday");
        g = myAccountItemsType6;
        MyAccountItemsType myAccountItemsType7 = new MyAccountItemsType("ACCOUNT_ACCESS_LEVEL", 6, "PrivacyAccessLevel");
        h = myAccountItemsType7;
        MyAccountItemsType myAccountItemsType8 = new MyAccountItemsType("ACCOUNT_MESSAGE_ACCESS_LEVEL", 7, "MessagingAccessLevel");
        i = myAccountItemsType8;
        MyAccountItemsType myAccountItemsType9 = new MyAccountItemsType("ACCOUNT_PREFERENCE", 8, "AccountPrefrence");
        j = myAccountItemsType9;
        MyAccountItemsType myAccountItemsType10 = new MyAccountItemsType("USERNAME", 9, "username");
        k = myAccountItemsType10;
        MyAccountItemsType[] myAccountItemsTypeArr = {myAccountItemsType, myAccountItemsType2, myAccountItemsType3, myAccountItemsType4, myAccountItemsType5, myAccountItemsType6, myAccountItemsType7, myAccountItemsType8, myAccountItemsType9, myAccountItemsType10};
        l = myAccountItemsTypeArr;
        kotlin.enums.a.a(myAccountItemsTypeArr);
    }

    public MyAccountItemsType(String str, int i2, String str2) {
        this.a = str2;
    }

    public static MyAccountItemsType valueOf(String str) {
        return (MyAccountItemsType) Enum.valueOf(MyAccountItemsType.class, str);
    }

    public static MyAccountItemsType[] values() {
        return (MyAccountItemsType[]) l.clone();
    }
}
