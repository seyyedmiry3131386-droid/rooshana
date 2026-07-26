package ir.mservices.market.togo;

import android.content.Context;
import android.net.NetworkInfo;
import com.google.gson.reflect.TypeToken;
import defpackage.c5;
import defpackage.cu2;
import defpackage.fw4;
import defpackage.js3;
import defpackage.s7;
import defpackage.vv2;
import defpackage.wq2;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.togo.data.MetadataDto;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cu2 {
    public final /* synthetic */ TogoViewModel a;
    public final /* synthetic */ TogoAction.GetMetadataAction b;

    public d(TogoViewModel togoViewModel, TogoAction.GetMetadataAction getMetadataAction) {
        this.a = togoViewModel;
        this.b = getMetadataAction;
    }

    @Override // defpackage.cu2
    public final void s(Context context, String str) {
        js3.p(str, "adId");
        String strA = wq2.A();
        String strX = wq2.x();
        String strI = wq2.I();
        String strZ = wq2.z();
        NetworkInfo networkInfoR = s7.r(context);
        String typeName = networkInfoR != null ? networkInfoR.getTypeName() : null;
        TogoViewModel togoViewModel = this.a;
        c5 c5Var = togoViewModel.y;
        String strB = c5Var.b();
        js3.o(strB, "getId(...)");
        String str2 = (String) c5Var.h.f;
        if (str2 == null) {
            str2 = "";
        }
        String strA2 = c5Var.a();
        js3.o(strA2, "getAccountId(...)");
        togoViewModel.z.getClass();
        togoViewModel.executeCallback(this.b.getSuccessCallback(), new vv2().g(new MetadataDto(strA, strX, strI, strZ, typeName, strB, str2, strA2, fw4.a(), wq2.y(context), str, LinkDTO.LINK_TYPE_MYKET_INTENT, NearbyRepository.SERVICE_ID, LinkDTO.LINK_TYPE_MYKET_INTENT), new TypeToken<MetadataDto>() { // from class: ir.mservices.market.togo.TogoViewModel$onGetMetadataAction$1$onSuccess$1$1
        }.getType()));
    }
}
