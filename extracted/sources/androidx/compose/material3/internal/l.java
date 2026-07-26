package androidx.compose.material3.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TextFieldType.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            TextFieldType[] textFieldTypeArr = TextFieldType.a;
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[InputPhase.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            InputPhase inputPhase = InputPhase.a;
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            InputPhase inputPhase2 = InputPhase.a;
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr2;
    }
}
