package defpackage;

import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.MergePaths$MergePathsMode;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class lu4 implements l41 {
    public final MergePaths$MergePathsMode a;
    public final boolean b;

    public lu4(String str, MergePaths$MergePathsMode mergePaths$MergePathsMode, boolean z) {
        this.a = mergePaths$MergePathsMode;
        this.b = z;
    }

    @Override // defpackage.l41
    public final r31 a(b bVar, gf4 gf4Var, t70 t70Var) {
        if (((HashSet) bVar.m.b).contains(LottieFeatureFlag.a)) {
            return new mu4(this);
        }
        qd4.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + this.a + '}';
    }
}
