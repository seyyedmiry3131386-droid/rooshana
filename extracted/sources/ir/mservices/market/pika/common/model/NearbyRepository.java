package ir.mservices.market.pika.common.model;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.nearby.zzpt;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
import com.google.android.gms.nearby.connection.Strategy;
import defpackage.a46;
import defpackage.bn6;
import defpackage.bo9;
import defpackage.br9;
import defpackage.bt2;
import defpackage.c22;
import defpackage.c35;
import defpackage.cf0;
import defpackage.d9;
import defpackage.df8;
import defpackage.dt2;
import defpackage.dx2;
import defpackage.e71;
import defpackage.eq;
import defpackage.fz1;
import defpackage.g51;
import defpackage.gf2;
import defpackage.hh2;
import defpackage.hl5;
import defpackage.hy2;
import defpackage.ja1;
import defpackage.js3;
import defpackage.jx9;
import defpackage.lz1;
import defpackage.mu3;
import defpackage.ol5;
import defpackage.ox9;
import defpackage.pl5;
import defpackage.q11;
import defpackage.qp2;
import defpackage.qs3;
import defpackage.r11;
import defpackage.rn6;
import defpackage.rq4;
import defpackage.rv6;
import defpackage.sd2;
import defpackage.sw2;
import defpackage.t15;
import defpackage.tb1;
import defpackage.th0;
import defpackage.tx8;
import defpackage.uq3;
import defpackage.ut4;
import defpackage.v48;
import defpackage.vb7;
import defpackage.vo1;
import defpackage.w11;
import defpackage.wq2;
import defpackage.wt3;
import defpackage.x41;
import defpackage.xb5;
import defpackage.xe2;
import defpackage.xt3;
import defpackage.yd1;
import defpackage.yk9;
import defpackage.yq2;
import defpackage.z36;
import defpackage.zk8;
import defpackage.zn9;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.pika.common.model.ConnectionState;
import ir.mservices.market.pika.common.model.FileState;
import ir.mservices.market.pika.common.model.PayloadState;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class NearbyRepository {
    public static final int ACCEPT_CONNECTION = 3;
    public static final int API_VERSION = 1;
    public static final int APP_INFO = 1;
    public static final int CONNECT_HANDSHAKE = 0;
    public static final Companion Companion = new Companion(null);
    private static final int MAX_WAIT_SECOND = 10;
    private static final long ONE_SECOND = 1000;
    public static final String SERVICE_ID = "ir.mservices.market";
    public static final String TAG = "NearbyRepository";
    private final xb5 _connectionState;
    private final xb5 _endPoints;
    private final xb5 _receivedByteArray;
    private final xb5 _receivedFiles;
    private final v48 connectionState;
    private final Context context;
    private String currentEndPointId;
    private final v48 endPoints;
    private final Map<Long, z36> filePayload;
    private final Map<Long, Boolean> fileSentPayloads;
    private final xe2 handShakeTimer;
    private final xb5 payloadState;
    private final v48 receivedByteArray;
    private final v48 receivedFiles;
    private wt3 timeOutJob;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ByteArrayType {
    }

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.pika.common.model.NearbyRepository$startWaitingForResult$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$startWaitingForResult$2", f = "NearbyRepository.kt", l = {516}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements qp2 {
        int label;

        /* JADX INFO: renamed from: ir.mservices.market.pika.common.model.NearbyRepository$startWaitingForResult$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.pika.common.model.NearbyRepository$startWaitingForResult$2$1", f = "NearbyRepository.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
            /* synthetic */ int I$0;
            int label;
            final /* synthetic */ NearbyRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NearbyRepository nearbyRepository, g51<? super AnonymousClass1> g51Var) {
                super(2, g51Var);
                this.this$0 = nearbyRepository;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51<tx8> create(Object obj, g51<?> g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, g51Var);
                anonymousClass1.I$0 = ((Number) obj).intValue();
                return anonymousClass1;
            }

            public final Object invoke(int i, g51<? super tx8> g51Var) {
                return ((AnonymousClass1) create(Integer.valueOf(i), g51Var)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                int i = this.I$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                if (i == 10) {
                    this.this$0.disconnect();
                    this.this$0.clearReceivedFiles();
                }
                return tx8.a;
            }

            @Override // defpackage.qp2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).intValue(), (g51<? super tx8>) obj2);
            }
        }

        public AnonymousClass2(g51<? super AnonymousClass2> g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51<tx8> create(Object obj, g51<?> g51Var) {
            return NearbyRepository.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(e71 e71Var, g51<? super tx8> g51Var) {
            return ((AnonymousClass2) create(e71Var, g51Var)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                xe2 xe2Var = NearbyRepository.this.handShakeTimer;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(NearbyRepository.this, null);
                this.label = 1;
                if (d.f(xe2Var, anonymousClass1, this) == coroutineSingletons) {
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

    public NearbyRepository(Context context) {
        js3.p(context, "context");
        this.context = context;
        this.currentEndPointId = "";
        l lVarB = ja1.b(new LinkedHashMap());
        this._receivedFiles = lVarB;
        this.receivedFiles = new rv6(lVarB);
        this.payloadState = ja1.b(new LinkedHashMap());
        l lVarB2 = ja1.b(new ArrayList());
        this._receivedByteArray = lVarB2;
        this.receivedByteArray = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this._connectionState = lVarB3;
        this.connectionState = new rv6(lVarB3);
        this.filePayload = new LinkedHashMap();
        this.handShakeTimer = new gf2(new d9(3, a.e0(new uq3(0, 10, 1))), new NearbyRepository$handShakeTimer$1(null), 4);
        this.fileSentPayloads = new LinkedHashMap();
        l lVarB4 = ja1.b(new ArrayList());
        this._endPoints = lVarB4;
        this.endPoints = new rv6(lVarB4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tx8 connectToEndPoint$lambda$0(NearbyRepository nearbyRepository, Void r1) {
        ((l) nearbyRepository._connectionState).o(ConnectionState.Discovery.INSTANCE);
        return tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectToEndPoint$lambda$2(NearbyRepository nearbyRepository, Exception exc) {
        js3.p(exc, "it");
        xb5 xb5Var = nearbyRepository._connectionState;
        ConnectionState.Error error = new ConnectionState.Error(exc);
        l lVar = (l) xb5Var;
        lVar.getClass();
        lVar.p(null, error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ByteArrayWrapper deserializeAsByteArrayWrapper(byte[] bArr) throws ClassNotFoundException, IOException {
        Object object = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        js3.n(object, "null cannot be cast to non-null type ir.mservices.market.pika.common.model.ByteArrayWrapper");
        return (ByteArrayWrapper) object;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleConnectionHandShake(ByteArrayResult.ConnectHandShake connectHandShake) {
        if (connectHandShake.getApiVersion() < 1) {
            ((l) this._connectionState).o(ConnectionState.PairDeviceUpdateRequire.INSTANCE);
            disconnect();
            clearReceivedFiles();
        } else {
            if (connectHandShake.getApiVersion() > 1) {
                ((l) this._connectionState).o(ConnectionState.OwnDeviceUpdateRequire.INSTANCE);
                disconnect();
                clearReceivedFiles();
                return;
            }
            xb5 xb5Var = this._receivedByteArray;
            ArrayList arrayListE = br9.E(connectHandShake);
            arrayListE.addAll((Collection) this.receivedByteArray.getValue());
            l lVar = (l) xb5Var;
            lVar.getClass();
            lVar.p(null, arrayListE);
            sendByteArray(serializeAsByteArrayWrapper(ByteArrayResult.AcceptConnection.INSTANCE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceivedFileState(z36 z36Var, PayloadTransferUpdate payloadTransferUpdate) {
        Uri uri;
        Object next;
        Uri uri2;
        Uri uri3;
        int i = payloadTransferUpdate.b;
        if (i != 1) {
            if (i == 2) {
                lz1 lz1Var = z36Var.d;
                if (lz1Var != null && (uri2 = (Uri) lz1Var.d) != null) {
                    this.context.getContentResolver().delete(uri2, null, null);
                }
                xb5 xb5Var = this._receivedFiles;
                LinkedHashMap linkedHashMapP = kotlin.collections.b.P((Map) this.receivedFiles.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), FileState.Failed.INSTANCE)));
                l lVar = (l) xb5Var;
                lVar.getClass();
                lVar.p(null, linkedHashMapP);
                return;
            }
            if (i == 3) {
                long j = (payloadTransferUpdate.d * ((long) 100)) / payloadTransferUpdate.c;
                xb5 xb5Var2 = this._receivedFiles;
                LinkedHashMap linkedHashMapP2 = kotlin.collections.b.P((Map) this.receivedFiles.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), new FileState.InProgress(j, payloadTransferUpdate.d, payloadTransferUpdate.c))));
                l lVar2 = (l) xb5Var2;
                lVar2.getClass();
                lVar2.p(null, linkedHashMapP2);
                return;
            }
            if (i != 4) {
                return;
            }
            lz1 lz1Var2 = z36Var.d;
            if (lz1Var2 != null && (uri3 = (Uri) lz1Var2.d) != null) {
                this.context.getContentResolver().delete(uri3, null, null);
            }
            xb5 xb5Var3 = this._receivedFiles;
            LinkedHashMap linkedHashMapP3 = kotlin.collections.b.P((Map) this.receivedFiles.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), FileState.Canceled.INSTANCE)));
            l lVar3 = (l) xb5Var3;
            lVar3.getClass();
            lVar3.p(null, linkedHashMapP3);
            return;
        }
        lz1 lz1Var3 = z36Var.d;
        if (lz1Var3 == null || (uri = (Uri) lz1Var3.d) == null) {
            return;
        }
        Iterable iterable = (Iterable) this.receivedByteArray.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof ByteArrayResult.AppInfo) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((ByteArrayResult.AppInfo) next).getId() == payloadTransferUpdate.a) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ByteArrayResult.AppInfo appInfo = (ByteArrayResult.AppInfo) next;
        if (appInfo != null) {
            xb5 xb5Var4 = this._receivedFiles;
            LinkedHashMap linkedHashMapP4 = kotlin.collections.b.P((Map) this.receivedFiles.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), new FileState.Saved(payloadTransferUpdate.a, appInfo.getPackageName(), appInfo.getVersionCode(), appInfo.isSplitApk(), uri))));
            l lVar4 = (l) xb5Var4;
            lVar4.getClass();
            lVar4.p(null, linkedHashMapP4);
        }
        lz1 lz1Var4 = z36Var.d;
        if (lz1Var4 != null) {
            yq2.N((ParcelFileDescriptor) lz1Var4.c);
        }
        hh2 hh2Var = z36Var.e;
        if (hh2Var != null) {
            yq2.N((ParcelFileDescriptor) hh2Var.b);
            yq2.O((ParcelFileDescriptor.AutoCloseInputStream) hh2Var.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleReceivedPayloadState(PayloadTransferUpdate payloadTransferUpdate) {
        int i = payloadTransferUpdate.b;
        if (i == 1) {
            l lVar = (l) this.payloadState;
            Map map = (Map) lVar.getValue();
            LinkedHashMap linkedHashMapO = kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), PayloadState.Success.INSTANCE));
            if (this.fileSentPayloads.containsKey(Long.valueOf(payloadTransferUpdate.a))) {
                this.fileSentPayloads.put(Long.valueOf(payloadTransferUpdate.a), Boolean.TRUE);
            }
            LinkedHashMap linkedHashMapP = kotlin.collections.b.P(map, linkedHashMapO);
            lVar.getClass();
            lVar.p(null, linkedHashMapP);
            return;
        }
        if (i == 2) {
            l lVar2 = (l) this.payloadState;
            LinkedHashMap linkedHashMapP2 = kotlin.collections.b.P((Map) lVar2.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), PayloadState.Failed.INSTANCE)));
            lVar2.getClass();
            lVar2.p(null, linkedHashMapP2);
            return;
        }
        if (i == 3) {
            long j = (payloadTransferUpdate.d * ((long) 100)) / payloadTransferUpdate.c;
            l lVar3 = (l) this.payloadState;
            LinkedHashMap linkedHashMapP3 = kotlin.collections.b.P((Map) lVar3.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), new PayloadState.InProgress(j, payloadTransferUpdate.d, payloadTransferUpdate.c))));
            lVar3.getClass();
            lVar3.p(null, linkedHashMapP3);
            return;
        }
        if (i != 4) {
            return;
        }
        l lVar4 = (l) this.payloadState;
        LinkedHashMap linkedHashMapP4 = kotlin.collections.b.P((Map) lVar4.getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(payloadTransferUpdate.a), PayloadState.Canceled.INSTANCE)));
        lVar4.getClass();
        lVar4.p(null, linkedHashMapP4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tx8 startAdvertising$lambda$0(NearbyRepository nearbyRepository, Void r1) {
        ((l) nearbyRepository._connectionState).o(ConnectionState.Advertising.INSTANCE);
        return tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startAdvertising$lambda$2(NearbyRepository nearbyRepository, Exception exc) {
        js3.p(exc, "it");
        xb5 xb5Var = nearbyRepository._connectionState;
        ConnectionState.Error error = new ConnectionState.Error(exc);
        l lVar = (l) xb5Var;
        lVar.getClass();
        lVar.p(null, error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tx8 startDiscovering$lambda$0(NearbyRepository nearbyRepository, Void r1) {
        ((l) nearbyRepository._connectionState).o(ConnectionState.Advertising.INSTANCE);
        return tx8.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startDiscovering$lambda$2(NearbyRepository nearbyRepository, Exception exc) {
        js3.p(exc, "it");
        xb5 xb5Var = nearbyRepository._connectionState;
        ConnectionState.Error error = new ConnectionState.Error(exc);
        l lVar = (l) xb5Var;
        lVar.getClass();
        lVar.p(null, error);
    }

    public final void cancelPayloadSend(long j) {
        bo9 bo9VarN = dt2.n(this.context);
        sd2 sd2Var = new sd2();
        sd2Var.a = j;
        cf0 cf0VarB = cf0.b();
        cf0VarB.b = 1229;
        cf0VarB.d = new hl5(bo9VarN, sd2Var);
        bo9VarN.f(1, cf0VarB.a());
    }

    public final void clearFileSentPayload() {
        this.fileSentPayloads.clear();
    }

    public final void clearReceivedFiles() {
        xb5 xb5Var = this.payloadState;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l lVar = (l) xb5Var;
        lVar.getClass();
        lVar.p(null, linkedHashMap);
        ((l) this._connectionState).o(null);
        xb5 xb5Var2 = this._endPoints;
        ArrayList arrayList = new ArrayList();
        l lVar2 = (l) xb5Var2;
        lVar2.getClass();
        lVar2.p(null, arrayList);
        xb5 xb5Var3 = this._receivedFiles;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        l lVar3 = (l) xb5Var3;
        lVar3.getClass();
        lVar3.p(null, linkedHashMap2);
        xb5 xb5Var4 = this._receivedByteArray;
        ArrayList arrayList2 = new ArrayList();
        l lVar4 = (l) xb5Var4;
        lVar4.getClass();
        lVar4.p(null, arrayList2);
    }

    public final void connectToEndPoint(String str) {
        js3.p(str, "endPointId");
        bo9 bo9VarN = dt2.n(this.context);
        String str2 = Build.MODEL;
        x41 x41VarD = bo9VarN.d(new zn9(bo9VarN, new r11() { // from class: ir.mservices.market.pika.common.model.NearbyRepository.connectToEndPoint.1
            @Override // defpackage.r11
            public void onConnectionInitiated(String str3, q11 q11Var) {
                js3.p(str3, "endPointId");
                js3.p(q11Var, "info");
                xb5 xb5Var = NearbyRepository.this._connectionState;
                ConnectionState.ConnectionInitiatedState connectionInitiatedState = new ConnectionState.ConnectionInitiatedState(str3, q11Var);
                l lVar = (l) xb5Var;
                lVar.getClass();
                lVar.p(null, connectionInitiatedState);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.r11
            public void onConnectionResult(String str3, w11 w11Var) {
                js3.p(str3, "endPointId");
                js3.p(w11Var, "result");
                int i = w11Var.a.a;
                int i2 = 1;
                if (i == 0) {
                    NearbyRepository.this.stopDiscovery();
                    NearbyRepository.this.currentEndPointId = str3;
                    NearbyRepository nearbyRepository = NearbyRepository.this;
                    nearbyRepository.sendByteArray(nearbyRepository.serializeAsByteArrayWrapper(new ByteArrayResult.ConnectHandShake(wq2.C(), 1)));
                    NearbyRepository.this.startWaitingForResult();
                    return;
                }
                if (i == 13) {
                    NearbyRepository.this.currentEndPointId = "";
                    xb5 xb5Var = NearbyRepository.this._connectionState;
                    ConnectionState.Error error = new ConnectionState.Error(null, i2, 0 == true ? 1 : 0);
                    l lVar = (l) xb5Var;
                    lVar.getClass();
                    lVar.p(null, error);
                    return;
                }
                if (i != 8004) {
                    return;
                }
                NearbyRepository.this.stopDiscovery();
                NearbyRepository.this.currentEndPointId = "";
                ((l) NearbyRepository.this._connectionState).o(ConnectionState.Disconnect.INSTANCE);
            }

            @Override // defpackage.r11
            public void onDisconnected(String str3) {
                js3.p(str3, "endPointId");
                NearbyRepository.this.currentEndPointId = "";
                ((l) NearbyRepository.this._connectionState).o(ConnectionState.Disconnect.INSTANCE);
            }
        }), r11.class.getName());
        bo9VarN.g(str);
        cf0 cf0VarB = cf0.b();
        cf0VarB.d = new bn6(bo9VarN, str, x41VarD);
        cf0VarB.b = 1226;
        ox9 ox9VarF = bo9VarN.f(1, cf0VarB.a());
        bn6 bn6Var = new bn6(25, bo9VarN, str, false);
        ox9VarF.getClass();
        sw2 sw2Var = df8.a;
        ox9VarF.a(sw2Var, bn6Var);
        ox9VarF.b(sw2Var, new qs3(29, new ol5(this, 2)));
        ox9VarF.i(new pl5(this, 2));
    }

    public final void connectionAccepted(String str) {
        js3.p(str, "endPointId");
        bo9 bo9VarN = dt2.n(this.context);
        x41 x41VarD = bo9VarN.d(new a46() { // from class: ir.mservices.market.pika.common.model.NearbyRepository.connectionAccepted.1
            @Override // defpackage.a46
            public void onPayloadReceived(String str2, z36 z36Var) {
                js3.p(str2, "endPointId");
                js3.p(z36Var, "payload");
                long j = z36Var.a;
                int i = z36Var.b;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    xb5 xb5Var = NearbyRepository.this._receivedFiles;
                    LinkedHashMap linkedHashMapP = kotlin.collections.b.P((Map) NearbyRepository.this.getReceivedFiles().getValue(), kotlin.collections.b.O(new Pair(Long.valueOf(j), FileState.Received.INSTANCE)));
                    l lVar = (l) xb5Var;
                    lVar.getClass();
                    lVar.p(null, linkedHashMapP);
                    NearbyRepository.this.filePayload.put(Long.valueOf(j), z36Var);
                    return;
                }
                byte[] bArr = z36Var.c;
                if (bArr != null) {
                    NearbyRepository nearbyRepository = NearbyRepository.this;
                    try {
                        ByteArrayWrapper byteArrayWrapperDeserializeAsByteArrayWrapper = nearbyRepository.deserializeAsByteArrayWrapper(bArr);
                        int type = byteArrayWrapperDeserializeAsByteArrayWrapper.getType();
                        if (type == 0) {
                            Object objDeserialize = nearbyRepository.deserialize(byteArrayWrapperDeserializeAsByteArrayWrapper.getWrappedData());
                            js3.n(objDeserialize, "null cannot be cast to non-null type ir.mservices.market.pika.common.model.ByteArrayResult.ConnectHandShake");
                            nearbyRepository.handleConnectionHandShake((ByteArrayResult.ConnectHandShake) objDeserialize);
                            return;
                        }
                        if (type != 1) {
                            if (type != 3) {
                                return;
                            }
                            ((l) nearbyRepository._connectionState).o(ConnectionState.Connected.INSTANCE);
                            wt3 timeOutJob = nearbyRepository.getTimeOutJob();
                            if (timeOutJob != null) {
                                timeOutJob.g(null);
                                return;
                            }
                            return;
                        }
                        Object objDeserialize2 = nearbyRepository.deserialize(byteArrayWrapperDeserializeAsByteArrayWrapper.getWrappedData());
                        js3.n(objDeserialize2, "null cannot be cast to non-null type ir.mservices.market.pika.common.model.ByteArrayResult.AppInfo");
                        ArrayList arrayListE = br9.E((ByteArrayResult.AppInfo) objDeserialize2);
                        arrayListE.addAll((Collection) nearbyRepository.getReceivedByteArray().getValue());
                        l lVar2 = (l) nearbyRepository._receivedByteArray;
                        lVar2.getClass();
                        lVar2.p(null, arrayListE);
                    } catch (IOException unused) {
                        nearbyRepository.disconnect();
                        nearbyRepository.clearReceivedFiles();
                    } catch (Exception unused2) {
                        nearbyRepository.disconnect();
                        nearbyRepository.clearReceivedFiles();
                    }
                }
            }

            @Override // defpackage.a46
            public void onPayloadTransferUpdate(String str2, PayloadTransferUpdate payloadTransferUpdate) {
                js3.p(str2, "endPointId");
                js3.p(payloadTransferUpdate, AppStatusDto.Type.UPDATE);
                z36 z36Var = (z36) NearbyRepository.this.filePayload.get(Long.valueOf(payloadTransferUpdate.a));
                if (z36Var != null) {
                    NearbyRepository.this.handleReceivedFileState(z36Var, payloadTransferUpdate);
                } else {
                    NearbyRepository.this.handleReceivedPayloadState(payloadTransferUpdate);
                }
            }
        }, a46.class.getName());
        cf0 cf0VarB = cf0.b();
        cf0VarB.d = new rn6(bo9VarN, str, x41VarD);
        cf0VarB.b = 1227;
        bo9VarN.f(1, cf0VarB.a());
    }

    public final void connectionRefused(String str) {
        js3.p(str, "endPointId");
        bo9 bo9VarN = dt2.n(this.context);
        dx2 dx2Var = new dx2(str, 1);
        cf0 cf0VarB = cf0.b();
        cf0VarB.b = 1229;
        cf0VarB.d = new hl5(bo9VarN, dx2Var);
        bo9VarN.f(1, cf0VarB.a());
    }

    public final z36 createFilePayload(File file) throws FileNotFoundException {
        js3.p(file, "file");
        zzpt zzptVar = z36.i;
        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
        long length = file.length();
        Uri uriFromFile = Uri.fromFile(file);
        rq4.o(parcelFileDescriptorOpen, "Cannot create Payload.File from null ParcelFileDescriptor.");
        rq4.o(uriFromFile, "Cannot create Payload.File from null Uri");
        return z36.c(new lz1(file, parcelFileDescriptorOpen, length, uriFromFile), UUID.randomUUID().getLeastSignificantBits());
    }

    public final Object deserialize(byte[] bArr) throws ClassNotFoundException, IOException {
        js3.p(bArr, "data");
        Object object = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        js3.o(object, "readObject(...)");
        return object;
    }

    public final void disconnect() {
        bo9 bo9VarN = dt2.n(this.context);
        String str = this.currentEndPointId;
        mu3 mu3Var = new mu3(str, 2);
        cf0 cf0VarB = cf0.b();
        cf0VarB.b = 1229;
        cf0VarB.d = new c35(20, mu3Var);
        bo9VarN.f(1, cf0VarB.a());
        bo9VarN.h(str);
        bo9VarN.l.c(bo9VarN, "advertising");
        bo9VarN.l.c(bo9VarN, "discovery").b(df8.a, new t15(20, bo9VarN));
        eq eqVar = eq.O;
        cf0 cf0VarB2 = cf0.b();
        cf0VarB2.b = 1229;
        cf0VarB2.d = new c35(20, eqVar);
        bo9VarN.f(1, cf0VarB2.a()).g(new ut4(22, bo9VarN));
    }

    public final v48 getConnectionState() {
        return this.connectionState;
    }

    public final v48 getEndPoints() {
        return this.endPoints;
    }

    public final xe2 getFinishedPayloads() {
        return new vb7(new NearbyRepository$getFinishedPayloads$$inlined$transform$1(this.payloadState, null, this));
    }

    public final xe2 getPayloadFlow(long j) {
        return new vb7(new NearbyRepository$getPayloadFlow$$inlined$transform$1(this.payloadState, null, j));
    }

    public final xe2 getReceiveFileFlow(long j) {
        return new vb7(new NearbyRepository$getReceiveFileFlow$$inlined$transform$1(this.receivedFiles, null, j));
    }

    public final v48 getReceivedByteArray() {
        return this.receivedByteArray;
    }

    public final v48 getReceivedFiles() {
        return this.receivedFiles;
    }

    public final wt3 getTimeOutJob() {
        return this.timeOutJob;
    }

    public final void sendByteArray(byte[] bArr) {
        if (bArr != null) {
            bo9 bo9VarN = dt2.n(this.context);
            String str = this.currentEndPointId;
            zzpt zzptVar = z36.i;
            z36 z36Var = new z36(UUID.randomUUID().getLeastSignificantBits(), 1, bArr, null, null);
            cf0 cf0VarB = cf0.b();
            cf0VarB.d = new com.google.android.gms.internal.nearby.a(bo9VarN, str, z36Var);
            cf0VarB.b = 1228;
            bo9VarN.f(1, cf0VarB.a());
        }
    }

    public final void sendFilePayload(z36 z36Var) {
        js3.p(z36Var, "payload");
        bo9 bo9VarN = dt2.n(this.context);
        String str = this.currentEndPointId;
        this.fileSentPayloads.put(Long.valueOf(z36Var.a), Boolean.FALSE);
        cf0 cf0VarB = cf0.b();
        cf0VarB.d = new com.google.android.gms.internal.nearby.a(bo9VarN, str, z36Var);
        cf0VarB.b = 1228;
        bo9VarN.f(1, cf0VarB.a());
    }

    public final byte[] serializeAsByteArrayWrapper(Object obj) {
        ByteArrayWrapper byteArrayWrapper;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            if (obj instanceof ByteArrayResult.ConnectHandShake) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                js3.o(byteArray, "toByteArray(...)");
                byteArrayWrapper = new ByteArrayWrapper(0, byteArray);
            } else if (obj instanceof ByteArrayResult.AppInfo) {
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                js3.o(byteArray2, "toByteArray(...)");
                byteArrayWrapper = new ByteArrayWrapper(1, byteArray2);
            } else if (obj instanceof ByteArrayResult.AcceptConnection) {
                byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                js3.o(byteArray3, "toByteArray(...)");
                byteArrayWrapper = new ByteArrayWrapper(3, byteArray3);
            } else {
                byte[] byteArray4 = byteArrayOutputStream.toByteArray();
                js3.o(byteArray4, "toByteArray(...)");
                byteArrayWrapper = new ByteArrayWrapper(3, byteArray4);
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream2).writeObject(byteArrayWrapper);
            return byteArrayOutputStream2.toByteArray();
        } catch (IOException e) {
            zk8.X(e, true);
            disconnect();
            clearReceivedFiles();
            return null;
        }
    }

    public final void setTimeOutJob(wt3 wt3Var) {
        this.timeOutJob = wt3Var;
    }

    public final void startAdvertising() {
        AdvertisingOptions advertisingOptions = new AdvertisingOptions();
        advertisingOptions.b = true;
        advertisingOptions.c = true;
        advertisingOptions.d = true;
        advertisingOptions.e = true;
        advertisingOptions.g = false;
        advertisingOptions.i = true;
        advertisingOptions.j = true;
        advertisingOptions.k = true;
        advertisingOptions.l = false;
        advertisingOptions.m = false;
        advertisingOptions.n = false;
        advertisingOptions.o = 0;
        advertisingOptions.p = 0;
        advertisingOptions.r = 0L;
        advertisingOptions.t = false;
        advertisingOptions.u = true;
        advertisingOptions.v = false;
        advertisingOptions.w = true;
        advertisingOptions.z = true;
        advertisingOptions.A = 0;
        advertisingOptions.C = true;
        advertisingOptions.D = 0;
        advertisingOptions.E = false;
        advertisingOptions.F = true;
        advertisingOptions.G = true;
        advertisingOptions.H = true;
        advertisingOptions.a = Strategy.e;
        int[] iArr = advertisingOptions.x;
        if (iArr != null && iArr.length > 0) {
            advertisingOptions.e = false;
            advertisingOptions.d = false;
            advertisingOptions.j = false;
            advertisingOptions.k = false;
            advertisingOptions.i = false;
            advertisingOptions.m = false;
            for (int i : iArr) {
                if (i == 2) {
                    advertisingOptions.d = true;
                } else if (i == 9) {
                    advertisingOptions.m = true;
                } else if (i == 4) {
                    advertisingOptions.e = true;
                } else if (i == 5) {
                    advertisingOptions.i = true;
                } else if (i == 6) {
                    advertisingOptions.k = true;
                } else if (i == 7) {
                    advertisingOptions.j = true;
                }
            }
        }
        int[] iArr2 = advertisingOptions.y;
        if (iArr2 != null && iArr2.length > 0) {
            advertisingOptions.v = false;
            int i2 = 0;
            while (true) {
                int[] iArr3 = advertisingOptions.y;
                if (i2 >= iArr3.length) {
                    break;
                }
                if (iArr3[i2] == 9) {
                    advertisingOptions.v = true;
                    break;
                }
                i2++;
            }
        }
        int i3 = advertisingOptions.A;
        if (i3 == 0) {
            advertisingOptions.A = true == advertisingOptions.g ? 1 : 3;
        } else {
            advertisingOptions.g = i3 != 3;
        }
        int i4 = advertisingOptions.D;
        if (i4 != 0) {
            advertisingOptions.u = i4 == 1;
        } else if (!advertisingOptions.u) {
            advertisingOptions.D = 2;
        }
        bo9 bo9VarN = dt2.n(this.context);
        String str = Build.MODEL;
        x41 x41VarD = bo9VarN.d(new zn9(bo9VarN, new r11() { // from class: ir.mservices.market.pika.common.model.NearbyRepository.startAdvertising.1
            @Override // defpackage.r11
            public void onConnectionInitiated(String str2, q11 q11Var) {
                js3.p(str2, "endPointId");
                js3.p(q11Var, "info");
                xb5 xb5Var = NearbyRepository.this._connectionState;
                ConnectionState.ConnectionInitiatedState connectionInitiatedState = new ConnectionState.ConnectionInitiatedState(str2, q11Var);
                l lVar = (l) xb5Var;
                lVar.getClass();
                lVar.p(null, connectionInitiatedState);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.r11
            public void onConnectionResult(String str2, w11 w11Var) {
                js3.p(str2, "endPointId");
                js3.p(w11Var, "result");
                int i5 = w11Var.a.a;
                int i6 = 1;
                if (i5 == 0) {
                    NearbyRepository.this.stopAdvertising();
                    NearbyRepository.this.currentEndPointId = str2;
                    NearbyRepository.this.startWaitingForResult();
                    NearbyRepository nearbyRepository = NearbyRepository.this;
                    nearbyRepository.sendByteArray(nearbyRepository.serializeAsByteArrayWrapper(new ByteArrayResult.ConnectHandShake(wq2.C(), 1)));
                    return;
                }
                if (i5 == 13) {
                    NearbyRepository.this.currentEndPointId = "";
                    xb5 xb5Var = NearbyRepository.this._connectionState;
                    ConnectionState.Error error = new ConnectionState.Error(null, i6, 0 == true ? 1 : 0);
                    l lVar = (l) xb5Var;
                    lVar.getClass();
                    lVar.p(null, error);
                    return;
                }
                if (i5 != 8004) {
                    return;
                }
                NearbyRepository.this.stopAdvertising();
                NearbyRepository.this.currentEndPointId = "";
                ((l) NearbyRepository.this._connectionState).o(ConnectionState.Disconnect.INSTANCE);
            }

            @Override // defpackage.r11
            public void onDisconnected(String str2) {
                js3.p(str2, "endPointId");
                NearbyRepository.this.currentEndPointId = "";
                ((l) NearbyRepository.this._connectionState).o(ConnectionState.Disconnect.INSTANCE);
            }
        }), r11.class.getName());
        x41 x41VarA = bo9VarN.l.a(bo9VarN, new Object(), "advertising");
        yk9 yk9Var = bo9VarN.l;
        jx9 jx9Var = new jx9();
        jx9Var.d = x41VarA;
        jx9Var.b = new rn6(bo9VarN, x41VarD, advertisingOptions);
        jx9Var.c = hy2.x;
        jx9Var.a = 1266;
        ox9 ox9VarB = yk9Var.b(bo9VarN, jx9Var.b());
        ox9VarB.b(df8.a, new qs3(27, new ol5(this, 0)));
        ox9VarB.i(new pl5(this, 0));
    }

    public final void startDiscovering() {
        xb5 xb5Var = this._endPoints;
        ArrayList arrayList = new ArrayList();
        l lVar = (l) xb5Var;
        lVar.getClass();
        lVar.p(null, arrayList);
        DiscoveryOptions discoveryOptions = new DiscoveryOptions();
        discoveryOptions.b = false;
        discoveryOptions.c = true;
        discoveryOptions.d = true;
        discoveryOptions.e = false;
        discoveryOptions.g = true;
        discoveryOptions.h = true;
        discoveryOptions.i = true;
        discoveryOptions.j = false;
        discoveryOptions.k = 0;
        discoveryOptions.l = 0;
        discoveryOptions.n = 0L;
        discoveryOptions.p = true;
        discoveryOptions.q = false;
        discoveryOptions.r = true;
        discoveryOptions.s = true;
        discoveryOptions.a = Strategy.e;
        int[] iArr = discoveryOptions.o;
        if (iArr != null && iArr.length > 0) {
            discoveryOptions.d = false;
            discoveryOptions.c = false;
            discoveryOptions.h = false;
            discoveryOptions.i = false;
            discoveryOptions.g = false;
            for (int i : iArr) {
                if (i == 2) {
                    discoveryOptions.c = true;
                } else if (i == 4) {
                    discoveryOptions.d = true;
                } else if (i == 5) {
                    discoveryOptions.g = true;
                } else if (i == 6) {
                    discoveryOptions.i = true;
                } else if (i == 7) {
                    discoveryOptions.h = true;
                }
            }
        }
        bo9 bo9VarN = dt2.n(this.context);
        x41 x41VarA = bo9VarN.l.a(bo9VarN, new c22() { // from class: ir.mservices.market.pika.common.model.NearbyRepository.startDiscovering.1
            @Override // defpackage.c22
            public void onEndpointFound(String str, vo1 vo1Var) {
                js3.p(str, "endPointId");
                js3.p(vo1Var, "info");
                xb5 xb5Var2 = NearbyRepository.this._endPoints;
                ArrayList arrayListE = br9.E(new EndPointInfo(str, vo1Var));
                arrayListE.addAll((Collection) NearbyRepository.this.getEndPoints().getValue());
                l lVar2 = (l) xb5Var2;
                lVar2.getClass();
                lVar2.p(null, arrayListE);
                ((l) NearbyRepository.this._connectionState).o(ConnectionState.EndPointFound.INSTANCE);
            }

            @Override // defpackage.c22
            public void onEndpointLost(String str) {
                js3.p(str, "endPointId");
                xb5 xb5Var2 = NearbyRepository.this._endPoints;
                Iterable iterable = (Iterable) NearbyRepository.this.getEndPoints().getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : iterable) {
                    if (!js3.i(((EndPointInfo) obj).getEndPintId(), str)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayListQ0 = a.Q0(arrayList2);
                l lVar2 = (l) xb5Var2;
                lVar2.getClass();
                lVar2.p(null, arrayListQ0);
            }
        }, "discovery");
        yk9 yk9Var = bo9VarN.l;
        jx9 jx9Var = new jx9();
        jx9Var.d = x41VarA;
        jx9Var.b = new bn6(bo9VarN, x41VarA, discoveryOptions);
        jx9Var.c = th0.z;
        jx9Var.a = 1267;
        ox9 ox9VarB = yk9Var.b(bo9VarN, jx9Var.b());
        rn6 rn6Var = new rn6(bo9VarN, discoveryOptions, 24);
        sw2 sw2Var = df8.a;
        ox9VarB.b(sw2Var, rn6Var);
        ox9VarB.a(sw2Var, fz1.w);
        ox9VarB.b(sw2Var, new qs3(28, new ol5(this, 1)));
        ox9VarB.i(new pl5(this, 1));
    }

    public final void startWaitingForResult() {
        wt3 wt3Var = this.timeOutJob;
        if (wt3Var != null) {
            wt3Var.g(null);
        }
        xt3 xt3VarA = kotlinx.coroutines.a.a();
        this.timeOutJob = xt3VarA;
        bt2.G(js3.a(xt3VarA), null, null, new AnonymousClass2(null), 3);
    }

    public final void stopAdvertising() {
        bo9 bo9VarN = dt2.n(this.context);
        bo9VarN.l.c(bo9VarN, "advertising");
    }

    public final void stopDiscovery() {
        bo9 bo9VarN = dt2.n(this.context);
        bo9VarN.l.c(bo9VarN, "discovery").b(df8.a, new t15(20, bo9VarN));
    }
}
