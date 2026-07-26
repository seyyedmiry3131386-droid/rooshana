package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mv extends a94 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv(no7 no7Var, int i) {
        super(no7Var);
        this.b = i;
    }

    @Override // defpackage.no7
    public final String a() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
