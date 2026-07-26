package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Transactor$SQLiteTransactionType {
    public static final Transactor$SQLiteTransactionType a;
    public static final Transactor$SQLiteTransactionType b;
    public static final /* synthetic */ Transactor$SQLiteTransactionType[] c;

    static {
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = new Transactor$SQLiteTransactionType("DEFERRED", 0);
        a = transactor$SQLiteTransactionType;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2 = new Transactor$SQLiteTransactionType("IMMEDIATE", 1);
        b = transactor$SQLiteTransactionType2;
        Transactor$SQLiteTransactionType[] transactor$SQLiteTransactionTypeArr = {transactor$SQLiteTransactionType, transactor$SQLiteTransactionType2, new Transactor$SQLiteTransactionType("EXCLUSIVE", 2)};
        c = transactor$SQLiteTransactionTypeArr;
        kotlin.enums.a.a(transactor$SQLiteTransactionTypeArr);
    }

    public static Transactor$SQLiteTransactionType valueOf(String str) {
        return (Transactor$SQLiteTransactionType) Enum.valueOf(Transactor$SQLiteTransactionType.class, str);
    }

    public static Transactor$SQLiteTransactionType[] values() {
        return (Transactor$SQLiteTransactionType[]) c.clone();
    }
}
