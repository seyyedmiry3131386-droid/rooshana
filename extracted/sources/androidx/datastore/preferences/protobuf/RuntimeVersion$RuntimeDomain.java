package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class RuntimeVersion$RuntimeDomain {
    public static final /* synthetic */ RuntimeVersion$RuntimeDomain[] a = {new RuntimeVersion$RuntimeDomain("GOOGLE_INTERNAL", 0), new RuntimeVersion$RuntimeDomain("PUBLIC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    RuntimeVersion$RuntimeDomain EF5;

    public static RuntimeVersion$RuntimeDomain valueOf(String str) {
        return (RuntimeVersion$RuntimeDomain) Enum.valueOf(RuntimeVersion$RuntimeDomain.class, str);
    }

    public static RuntimeVersion$RuntimeDomain[] values() {
        return (RuntimeVersion$RuntimeDomain[]) a.clone();
    }
}
