package com.google.android.gms.internal.nearby;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Pair;
import defpackage.bo9;
import defpackage.cf8;
import defpackage.fq9;
import defpackage.fw7;
import defpackage.hh2;
import defpackage.kp9;
import defpackage.lm9;
import defpackage.lz1;
import defpackage.q37;
import defpackage.qo8;
import defpackage.rq4;
import defpackage.vo4;
import defpackage.wm9;
import defpackage.z36;
import defpackage.zm9;
import io.sentry.android.core.t0;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q37 {
    public final /* synthetic */ String a;
    public final /* synthetic */ z36 b;

    public /* synthetic */ a(bo9 bo9Var, String str, z36 z36Var) {
        this.a = str;
        this.b = z36Var;
    }

    @Override // defpackage.q37
    public final void accept(Object obj, Object obj2) {
        Pair pairCreate;
        zm9 zm9Var = (zm9) obj;
        vo4 vo4Var = new vo4(21, (cf8) obj2);
        String[] strArr = {this.a};
        z36 z36Var = this.b;
        zm9Var.getClass();
        try {
            int i = z36Var.b;
            if (i == 1) {
                zzhk zzhkVar = new zzhk();
                zzhkVar.f = -1L;
                zzhkVar.i = 0L;
                zzhkVar.j = false;
                zzhkVar.l = 0L;
                zzhkVar.a = z36Var.a;
                zzhkVar.b = i;
                byte[] bArr = z36Var.c;
                if (bArr == null || bArr.length <= 32768) {
                    zzhkVar.c = bArr;
                } else {
                    zzhg zzhgVar = new zzhg();
                    zzhgVar.a = bArr;
                    zzhkVar.k = zzhgVar;
                    zzhkVar.c = Arrays.copyOf(bArr, 32768);
                }
                pairCreate = Pair.create(zzhkVar, zzph.a);
            } else if (i == 2) {
                lz1 lz1Var = z36Var.d;
                if (lz1Var == null) {
                    throw new NullPointerException("File cannot be null for Payload.Type.FILE");
                }
                File file = (File) lz1Var.b;
                String absolutePath = file == null ? null : file.getAbsolutePath();
                Uri uri = (Uri) lz1Var.d;
                zzhk zzhkVar2 = new zzhk();
                zzhkVar2.a = z36Var.a;
                zzhkVar2.b = z36Var.b;
                zzhkVar2.d = (ParcelFileDescriptor) lz1Var.c;
                zzhkVar2.h = uri;
                zzhkVar2.e = absolutePath;
                zzhkVar2.f = lz1Var.a;
                zzhkVar2.i = 0L;
                zzhkVar2.j = false;
                zzhkVar2.l = z36Var.f;
                zzhkVar2.m = z36Var.g;
                zzhkVar2.n = z36Var.h;
                pairCreate = Pair.create(zzhkVar2, zzph.a);
            } else {
                if (i != 3) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(z36Var.a), Integer.valueOf(z36Var.b)));
                    t0.o("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                    throw illegalArgumentException;
                }
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = ParcelFileDescriptor.createPipe();
                    zzhk zzhkVar3 = new zzhk();
                    zzhkVar3.f = -1L;
                    zzhkVar3.i = 0L;
                    zzhkVar3.j = false;
                    zzhkVar3.l = 0L;
                    zzhkVar3.a = z36Var.a;
                    zzhkVar3.b = z36Var.b;
                    zzhkVar3.d = parcelFileDescriptorArrCreatePipe[0];
                    zzhkVar3.g = parcelFileDescriptorArrCreatePipe2[0];
                    zzhkVar3.i = 0L;
                    zzhkVar3.l = z36Var.f;
                    Pair pairCreate2 = Pair.create(parcelFileDescriptorArrCreatePipe[1], parcelFileDescriptorArrCreatePipe2[1]);
                    pairCreate2.getClass();
                    pairCreate = Pair.create(zzhkVar3, new zzpn(pairCreate2));
                } catch (IOException e) {
                    t0.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(z36Var.a)), e);
                    throw e;
                }
            }
            kp9 kp9Var = (kp9) zm9Var.getService();
            zzhx zzhxVar = new zzhx();
            zzhxVar.a = new wm9(vo4Var);
            zzhxVar.b = strArr;
            zzhxVar.c = (zzhk) pairCreate.first;
            Parcel parcelN0 = kp9Var.n0();
            int i2 = lm9.a;
            parcelN0.writeInt(1);
            zzhxVar.writeToParcel(parcelN0, 0);
            kp9Var.o0(2008, parcelN0);
            if (((zzpl) pairCreate.second).b()) {
                Object objA = ((zzpl) pairCreate.second).a();
                fq9 fq9Var = zm9Var.i;
                if (fq9Var != null) {
                    hh2 hh2Var = z36Var.e;
                    rq4.n(hh2Var);
                    if (((ParcelFileDescriptor.AutoCloseInputStream) hh2Var.c) == null) {
                        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) hh2Var.b;
                        rq4.n(parcelFileDescriptor);
                        hh2Var.c = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
                    }
                    ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = (ParcelFileDescriptor.AutoCloseInputStream) hh2Var.c;
                    Pair pair = (Pair) objA;
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.first);
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second);
                    zzhk zzhkVar4 = (zzhk) pairCreate.first;
                    long j = z36Var.a;
                    synchronized (fq9Var) {
                        fw7 fw7Var = fq9Var.b;
                        Long lValueOf = Long.valueOf(j);
                        fw7Var.put(lValueOf, autoCloseInputStream);
                        fq9Var.d.put(lValueOf, autoCloseOutputStream);
                        fq9Var.e.put(lValueOf, zzhkVar4);
                        fq9Var.a.execute(new qo8(fq9Var, autoCloseInputStream, autoCloseOutputStream, j, autoCloseOutputStream2));
                    }
                }
            }
        } catch (IOException e2) {
            t0.n("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e2);
            vo4Var.r(zm9.b(8013));
        }
    }
}
