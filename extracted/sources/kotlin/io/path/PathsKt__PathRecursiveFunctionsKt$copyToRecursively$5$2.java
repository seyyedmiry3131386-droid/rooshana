package kotlin.io.path;

import defpackage.gd1;
import defpackage.js3;
import defpackage.qp2;
import defpackage.yq2;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        Path pathE = gd1.e(obj);
        js3.p(pathE, "p0");
        js3.p((BasicFileAttributes) obj2, "p1");
        try {
            throw null;
        } catch (Exception unused) {
            yq2.S(pathE);
            throw null;
        }
    }
}
