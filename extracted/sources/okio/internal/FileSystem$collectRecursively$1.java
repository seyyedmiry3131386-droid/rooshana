package okio.internal;

import defpackage.io7;
import defpackage.ov;
import defpackage.s26;
import defpackage.tb1;
import defpackage.tb2;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively", v = 1)
final class FileSystem$collectRecursively$1 extends ContinuationImpl {
    public io7 a;
    public tb2 b;
    public ov c;
    public s26 d;
    public Iterator e;
    public boolean f;
    public int g;
    public /* synthetic */ Object h;
    public int i;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return a.a(null, null, null, null, false, this);
    }
}
