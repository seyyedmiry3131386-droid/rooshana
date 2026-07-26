package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.social.list.common.app.data.ProfileApplicationsRequestDto;
import ir.mservices.market.social.list.common.movie.data.MoviesProfileRequestDto;
import ir.mservices.market.social.list.items.model.SelectedItemsRepositoryImpl$getSelectedItemFlow$$inlined$transform$1;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class um7 {
    public final gm a;
    public final zz4 b;
    public final l c;

    public um7(gm gmVar, zz4 zz4Var) {
        js3.p(gmVar, "appAddService");
        js3.p(zz4Var, "movieAddService");
        this.a = gmVar;
        this.b = zz4Var;
        this.c = ja1.b(EmptyList.a);
    }

    public final void a() {
        l lVar;
        Object value;
        do {
            lVar = this.c;
            value = lVar.getValue();
        } while (!lVar.n(value, EmptyList.a));
    }

    public final vb7 b(String str) {
        js3.p(str, "key");
        return new vb7(new SelectedItemsRepositoryImpl$getSelectedItemFlow$$inlined$transform$1(this.c, null, str));
    }

    public final Object c(String str, String str2, ArrayList arrayList, Object obj, SuspendLambda suspendLambda) {
        gm gmVar = this.a;
        if (str == null || f88.n0(str)) {
            ProfileApplicationsRequestDto profileApplicationsRequestDto = new ProfileApplicationsRequestDto(str2, arrayList);
            z57 z57VarCreateRequestUrl = gmVar.createRequestUrl("social", "v1/profiles/own/custom-app-lists", null, gmVar.getCommonQueryParam());
            Type type = new TypeToken<ProfileApplicationsRequestDto>() { // from class: ir.mservices.market.social.list.add.app.service.AppAddService$createAppList$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            return dy3.G(gmVar, type, z57VarCreateRequestUrl, profileApplicationsRequestDto, obj, null, null, suspendLambda, 496);
        }
        ProfileApplicationsRequestDto profileApplicationsRequestDto2 = new ProfileApplicationsRequestDto(str2, arrayList);
        gmVar.getClass();
        z57 z57VarCreateRequestUrl2 = gmVar.createRequestUrl("social", "v1/profiles/own/custom-app-lists/{listType}", b.O(new Pair("listType", str)), gmVar.getCommonQueryParam());
        Type type2 = new TypeToken<ProfileApplicationsRequestDto>() { // from class: ir.mservices.market.social.list.add.app.service.AppAddService$editAppList$2
        }.getType();
        js3.o(type2, "getType(...)");
        js3.m(z57VarCreateRequestUrl2);
        return dy3.I(gmVar, type2, z57VarCreateRequestUrl2, profileApplicationsRequestDto2, obj, null, suspendLambda, 496);
    }

    public final Object d(String str, String str2, ArrayList arrayList, Object obj, SuspendLambda suspendLambda) {
        zz4 zz4Var = this.b;
        if (str == null || f88.n0(str)) {
            MoviesProfileRequestDto moviesProfileRequestDto = new MoviesProfileRequestDto(str2, arrayList);
            z57 z57VarCreateRequestUrl = zz4Var.createRequestUrl("social", "v1/profiles/own/custom-movie-lists", null, zz4Var.getCommonQueryParam());
            Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.social.list.add.movie.service.MovieAddService$createMovieProfileList$2
            }.getType();
            js3.o(type, "getType(...)");
            js3.m(z57VarCreateRequestUrl);
            return dy3.G(zz4Var, type, z57VarCreateRequestUrl, moviesProfileRequestDto, obj, null, null, suspendLambda, 496);
        }
        MoviesProfileRequestDto moviesProfileRequestDto2 = new MoviesProfileRequestDto(str2, arrayList);
        zz4Var.getClass();
        z57 z57VarCreateRequestUrl2 = zz4Var.createRequestUrl("social", "v1/profiles/own/custom-movie-lists/{listType}", b.O(new Pair("listType", str)), zz4Var.getCommonQueryParam());
        Type type2 = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.social.list.add.movie.service.MovieAddService$editMovieProfileList$2
        }.getType();
        js3.o(type2, "getType(...)");
        js3.m(z57VarCreateRequestUrl2);
        return dy3.I(zz4Var, type2, z57VarCreateRequestUrl2, moviesProfileRequestDto2, obj, null, suspendLambda, 496);
    }

    public final void e(SelectableRecyclerData selectableRecyclerData) {
        l lVar;
        Object value;
        List list;
        js3.p(selectableRecyclerData, "item");
        do {
            lVar = this.c;
            value = lVar.getValue();
            list = (List) value;
        } while (!lVar.n(value, list.contains(selectableRecyclerData) ? a.y0(selectableRecyclerData, list) : a.A0(selectableRecyclerData, list)));
    }
}
