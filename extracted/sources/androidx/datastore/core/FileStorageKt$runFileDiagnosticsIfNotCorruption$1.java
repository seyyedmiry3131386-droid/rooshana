package androidx.datastore.core;

import defpackage.tb1;
import java.io.File;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.FileStorageKt", f = "FileStorage.kt", l = {224}, m = "runFileDiagnosticsIfNotCorruption", v = 1)
final class FileStorageKt$runFileDiagnosticsIfNotCorruption$1<T> extends ContinuationImpl {
    public File a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return a.a(null, null, this);
    }
}
