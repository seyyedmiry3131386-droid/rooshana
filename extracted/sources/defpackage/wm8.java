package defpackage;

import ir.mservices.market.app.detail.data.AppDataDto;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.togo.TogoFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class wm8 implements ze2 {
    public final /* synthetic */ TogoFragment a;

    public wm8(TogoFragment togoFragment) {
        this.a = togoFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        Boolean hasPatch;
        Boolean hasPatch2;
        n99 n99Var = (n99) obj;
        boolean z = n99Var instanceof h99;
        TogoFragment togoFragment = this.a;
        if (z) {
            int i = TogoFragment.o1;
            if (togoFragment.J0.g() instanceof ProgressDialogFragment) {
                togoFragment.J0.q();
            }
            ((h99) n99Var).a.assertToastMessage(togoFragment.F());
        } else if (n99Var instanceof j99) {
            int i2 = TogoFragment.o1;
            pk5.g(togoFragment.J0, new NavIntentDirections.Progress(new em6(new DialogDataModel(togoFragment.m1(), "DIALOG_KEY_PROGRESS", null, 12), true)), -1);
        } else {
            if (!(n99Var instanceof l99)) {
                throw new NoWhenBranchMatchedException();
            }
            du duVar = togoFragment.a1;
            if (duVar == null) {
                js3.V("appUtils");
                throw null;
            }
            ApplicationFullDto applicationFullDto = (ApplicationFullDto) ((l99) n99Var).a;
            js3.p(applicationFullDto, "data");
            boolean zIsIncompatible = applicationFullDto.getVersion().isIncompatible();
            String packageName = applicationFullDto.getPackageName();
            String title = applicationFullDto.getTitle();
            boolean zIsFree = applicationFullDto.getPrice().isFree();
            String buttonText = applicationFullDto.getButtonText();
            applicationFullDto.getPrice().getRealPrice();
            applicationFullDto.getHasIAP();
            applicationFullDto.getVersion().getName();
            int code = applicationFullDto.getVersion().getCode();
            long length = applicationFullDto.getSize().getLength();
            AppDataDto appData = applicationFullDto.getAppData();
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = (appData == null || (hasPatch2 = appData.getHasPatch()) == null) ? false : hasPatch2.booleanValue();
            AppDataDto appData2 = applicationFullDto.getAppData();
            if (appData2 != null && (hasPatch = appData2.getHasPatch()) != null) {
                zBooleanValue = hasPatch.booleanValue();
            }
            String url = applicationFullDto.getIcon().getUrl();
            applicationFullDto.getCategoryName();
            duVar.a(new r82(zIsIncompatible, packageName, title, zIsFree, buttonText, code, length, zBooleanValue2, zBooleanValue, url, applicationFullDto.getForceUpdate()), togoFragment.F(), sa7.h(((ApplicationFullDto) ((l99) n99Var).a).getRefId(), new mw7(13)), applicationFullDto.getCallbackUrl(), applicationFullDto.getInstallCallbackUrl(), "other");
            if (togoFragment.J0.g() instanceof ProgressDialogFragment) {
                togoFragment.J0.q();
            }
        }
        return tx8.a;
    }
}
