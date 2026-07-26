package ir.mservices.market.pika.send;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle$State;
import defpackage.au0;
import defpackage.bu0;
import defpackage.cu0;
import defpackage.dp2;
import defpackage.dp3;
import defpackage.du0;
import defpackage.g51;
import defpackage.gf2;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rm2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wx7;
import defpackage.z36;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.core.utils.a;
import ir.mservices.market.views.PikaReceiveView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppDetailFragment$onViewCreated$1", f = "SendAppDetailFragment.kt", l = {107}, m = "invokeSuspend", v = 1)
final class SendAppDetailFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SendAppDetailFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.send.SendAppDetailFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.send.SendAppDetailFragment$onViewCreated$1$1", f = "SendAppDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ SendAppDetailFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendAppDetailFragment sendAppDetailFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = sendAppDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((du0) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws FileNotFoundException {
            long j;
            du0 du0Var = (du0) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            SendAppDetailFragment sendAppDetailFragment = this.b;
            rm2 rm2Var = sendAppDetailFragment.V0;
            if (rm2Var == null) {
                js3.V("binding");
                throw null;
            }
            PikaReceiveView pikaReceiveView = rm2Var.y;
            js3.o(pikaReceiveView, "install");
            boolean z = du0Var instanceof cu0;
            pikaReceiveView.setVisibility(z ? 0 : 8);
            rm2 rm2Var2 = sendAppDetailFragment.V0;
            if (rm2Var2 == null) {
                js3.V("binding");
                throw null;
            }
            boolean z2 = du0Var instanceof au0;
            rm2Var2.A.setEnabled(z2);
            if (!(du0Var instanceof bu0)) {
                if (z2) {
                    String string = !((au0) du0Var).a ? sendAppDetailFragment.K().getString(rs6.device_cant_use_app) : sendAppDetailFragment.K().getString(rs6.app_progress_failed);
                    js3.m(string);
                    SendAppDetailFragment.k1(sendAppDetailFragment, string, true, false);
                } else {
                    if (!z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wx7 wx7Var = ((cu0) du0Var).a;
                    SendAppViewModel sendAppViewModelM1 = sendAppDetailFragment.m1();
                    String str = (String) wx7Var.b;
                    String str2 = (String) wx7Var.c;
                    boolean z3 = wx7Var.a;
                    dp3 dp3Var = sendAppViewModelM1.t;
                    NearbyRepository nearbyRepository = sendAppViewModelM1.u;
                    js3.p(str2, "filePath");
                    File file = new File(str2);
                    if (file.exists()) {
                        z36 z36VarCreateFilePayload = nearbyRepository.createFilePayload(file);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        dp3Var.k(str).compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        String strU = dp3Var.u(str);
                        Integer numP = dp3Var.p(str);
                        long j2 = z36VarCreateFilePayload.a;
                        js3.m(numP);
                        int iIntValue = numP.intValue();
                        js3.m(strU);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        js3.o(byteArray, "toByteArray(...)");
                        ByteArrayResult.AppInfo appInfo = new ByteArrayResult.AppInfo(j2, str, iIntValue, strU, byteArray, z3, true);
                        nearbyRepository.sendByteArray(nearbyRepository.serializeAsByteArrayWrapper(appInfo));
                        if (appInfo.isSupported()) {
                            nearbyRepository.sendFilePayload(z36VarCreateFilePayload);
                        }
                        j = z36VarCreateFilePayload.a;
                        l lVar = sendAppViewModelM1.J;
                        Long lValueOf = Long.valueOf(j);
                        lVar.getClass();
                        lVar.p(null, lValueOf);
                    } else {
                        j = -1;
                    }
                    a.d(sendAppDetailFragment, Lifecycle$State.d, new SendAppDetailFragment$collectSendProgress$1(sendAppDetailFragment, j, null));
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppDetailFragment$onViewCreated$1(SendAppDetailFragment sendAppDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = sendAppDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SendAppDetailFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SendAppDetailFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = SendAppDetailFragment.e1;
            SendAppDetailFragment sendAppDetailFragment = this.b;
            gf2 gf2Var = sendAppDetailFragment.m1().M;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(sendAppDetailFragment, null);
            this.a = 1;
            if (d.f(gf2Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
