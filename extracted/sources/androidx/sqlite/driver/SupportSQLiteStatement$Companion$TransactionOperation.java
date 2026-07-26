package androidx.sqlite.driver;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class SupportSQLiteStatement$Companion$TransactionOperation {
    public static final SupportSQLiteStatement$Companion$TransactionOperation a;
    public static final SupportSQLiteStatement$Companion$TransactionOperation b;
    public static final SupportSQLiteStatement$Companion$TransactionOperation c;
    public static final SupportSQLiteStatement$Companion$TransactionOperation d;
    public static final SupportSQLiteStatement$Companion$TransactionOperation e;
    public static final /* synthetic */ SupportSQLiteStatement$Companion$TransactionOperation[] f;

    static {
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation = new SupportSQLiteStatement$Companion$TransactionOperation("END", 0);
        a = supportSQLiteStatement$Companion$TransactionOperation;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation2 = new SupportSQLiteStatement$Companion$TransactionOperation("ROLLBACK", 1);
        b = supportSQLiteStatement$Companion$TransactionOperation2;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation3 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_EXCLUSIVE", 2);
        c = supportSQLiteStatement$Companion$TransactionOperation3;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation4 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_IMMEDIATE", 3);
        d = supportSQLiteStatement$Companion$TransactionOperation4;
        SupportSQLiteStatement$Companion$TransactionOperation supportSQLiteStatement$Companion$TransactionOperation5 = new SupportSQLiteStatement$Companion$TransactionOperation("BEGIN_DEFERRED", 4);
        e = supportSQLiteStatement$Companion$TransactionOperation5;
        SupportSQLiteStatement$Companion$TransactionOperation[] supportSQLiteStatement$Companion$TransactionOperationArr = {supportSQLiteStatement$Companion$TransactionOperation, supportSQLiteStatement$Companion$TransactionOperation2, supportSQLiteStatement$Companion$TransactionOperation3, supportSQLiteStatement$Companion$TransactionOperation4, supportSQLiteStatement$Companion$TransactionOperation5};
        f = supportSQLiteStatement$Companion$TransactionOperationArr;
        kotlin.enums.a.a(supportSQLiteStatement$Companion$TransactionOperationArr);
    }

    public static SupportSQLiteStatement$Companion$TransactionOperation valueOf(String str) {
        return (SupportSQLiteStatement$Companion$TransactionOperation) Enum.valueOf(SupportSQLiteStatement$Companion$TransactionOperation.class, str);
    }

    public static SupportSQLiteStatement$Companion$TransactionOperation[] values() {
        return (SupportSQLiteStatement$Companion$TransactionOperation[]) f.clone();
    }
}
