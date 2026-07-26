package androidx.loader.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ModernAsyncTask$Status {
    public static final ModernAsyncTask$Status a;
    public static final ModernAsyncTask$Status b;
    public static final ModernAsyncTask$Status c;
    public static final /* synthetic */ ModernAsyncTask$Status[] d;

    static {
        ModernAsyncTask$Status modernAsyncTask$Status = new ModernAsyncTask$Status("PENDING", 0);
        a = modernAsyncTask$Status;
        ModernAsyncTask$Status modernAsyncTask$Status2 = new ModernAsyncTask$Status("RUNNING", 1);
        b = modernAsyncTask$Status2;
        ModernAsyncTask$Status modernAsyncTask$Status3 = new ModernAsyncTask$Status("FINISHED", 2);
        c = modernAsyncTask$Status3;
        d = new ModernAsyncTask$Status[]{modernAsyncTask$Status, modernAsyncTask$Status2, modernAsyncTask$Status3};
    }

    public static ModernAsyncTask$Status valueOf(String str) {
        return (ModernAsyncTask$Status) Enum.valueOf(ModernAsyncTask$Status.class, str);
    }

    public static ModernAsyncTask$Status[] values() {
        return (ModernAsyncTask$Status[]) d.clone();
    }
}
