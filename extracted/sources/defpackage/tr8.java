package defpackage;

import androidx.transition.Transition;
import androidx.transition.TransitionSet;

/* JADX INFO: loaded from: classes.dex */
public final class tr8 extends pr8 {
    public final /* synthetic */ int a = 1;
    public TransitionSet b;

    public /* synthetic */ tr8() {
    }

    @Override // defpackage.pr8, defpackage.gr8
    public void b(Transition transition) {
        switch (this.a) {
            case 1:
                TransitionSet transitionSet = this.b;
                if (!transitionSet.K) {
                    transitionSet.N();
                    transitionSet.K = true;
                }
                break;
        }
    }

    @Override // defpackage.pr8, defpackage.gr8
    public void d(Transition transition) {
        switch (this.a) {
            case 1:
                TransitionSet transitionSet = this.b;
                int i = transitionSet.J - 1;
                transitionSet.J = i;
                if (i == 0) {
                    transitionSet.K = false;
                    transitionSet.m();
                }
                transition.C(this);
                break;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pr8, defpackage.gr8
    public void f(Transition transition) {
        switch (this.a) {
            case 0:
                TransitionSet transitionSet = this.b;
                transitionSet.H.remove(transition);
                if (!transitionSet.u()) {
                    transitionSet.z(transitionSet, p58.d, false);
                    transitionSet.t = true;
                    transitionSet.z(transitionSet, p58.c, false);
                }
                break;
        }
    }

    public tr8(TransitionSet transitionSet) {
        this.b = transitionSet;
    }
}
