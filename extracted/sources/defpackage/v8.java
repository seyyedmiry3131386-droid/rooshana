package defpackage;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v8 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb5 b;

    public /* synthetic */ v8(wb5 wb5Var, int i) {
        this.a = i;
        this.b = wb5Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return tx8.a;
            case 1:
                Boolean bool = (Boolean) this.b.getValue();
                bool.booleanValue();
                return bool;
            case 2:
                v04 v04Var = (v04) this.b.getValue();
                if (v04Var != null) {
                    return v04Var;
                }
                un3.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 3:
                v04 v04Var2 = (v04) this.b.getValue();
                if (v04Var2 != null) {
                    return v04Var2;
                }
                un3.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 4:
                Boolean bool2 = (Boolean) this.b.getValue();
                bool2.booleanValue();
                return bool2;
            case 5:
                return (t34) ((bp2) this.b.getValue()).invoke();
            case 6:
                return new s34((dp2) this.b.getValue());
            case 7:
                this.b.setValue(Boolean.TRUE);
                return tx8.a;
            case 8:
                v04 v04Var3 = (v04) this.b.getValue();
                if (v04Var3 != null) {
                    return v04Var3;
                }
                un3.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 9:
                this.b.setValue(Boolean.TRUE);
                return tx8.a;
            case 10:
                this.b.setValue(Boolean.TRUE);
                return tx8.a;
            default:
                return (v04) this.b.getValue();
        }
    }
}
