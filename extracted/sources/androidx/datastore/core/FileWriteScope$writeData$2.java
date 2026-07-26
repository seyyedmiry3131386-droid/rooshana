package androidx.datastore.core;

import defpackage.ac2;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.g51;
import defpackage.mx8;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tv8;
import defpackage.tx8;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.FileWriteScope$writeData$2", f = "FileStorage.kt", l = {206}, m = "invokeSuspend", v = 1)
final class FileWriteScope$writeData$2 extends SuspendLambda implements dp2 {
    public FileOutputStream a;
    public FileOutputStream b;
    public int c;
    public final /* synthetic */ ac2 d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileWriteScope$writeData$2(ac2 ac2Var, Object obj, g51 g51Var) {
        super(1, g51Var);
        this.d = ac2Var;
        this.e = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new FileWriteScope$writeData$2(this.d, this.e, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((FileWriteScope$writeData$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        File file = this.d.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        tx8 tx8Var = tx8.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                FileOutputStream fileOutputStreamK = io.sentry.config.a.k(new FileOutputStream(file), file);
                Object obj2 = this.e;
                try {
                    th0 th0Var = th0.r;
                    mx8 mx8Var = new mx8(fileOutputStreamK);
                    this.a = fileOutputStreamK;
                    this.b = fileOutputStreamK;
                    this.c = 1;
                    th0Var.o(obj2, mx8Var);
                    if (tx8Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    fileOutputStream2 = fileOutputStreamK;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th2) {
                    fileOutputStream = fileOutputStreamK;
                    th = th2;
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fileOutputStream2 = this.b;
                fileOutputStream = this.a;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        tv8.h(fileOutputStream, th);
                        throw th4;
                    }
                }
            }
            fileOutputStream2.getFD().sync();
            tv8.h(fileOutputStream, null);
            return tx8Var;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw bt2.a0(file.getParent(), (FileNotFoundException) e);
            }
            throw e;
        }
    }
}
