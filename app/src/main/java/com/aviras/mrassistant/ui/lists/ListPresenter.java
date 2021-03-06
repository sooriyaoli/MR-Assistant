package com.aviras.mrassistant.ui.lists;

import android.content.Context;

import com.aviras.mrassistant.ui.Presenter;

import io.realm.RealmObject;

/**
 * Presenter interface for showing list
 * <p/>
 * Created by ashish on 14/6/16.
 */
public interface ListPresenter<T extends RealmObject> extends Presenter {

    /**
     * Loads list of {@link RealmObject}s
     *
     * @param searchString
     */
    void load(CharSequence searchString);

    /**
     * Set the list view. This view will get all view related callbacks
     *
     * @param listView
     */
    void setView(ListView listView);

    /**
     * Open add item screen for this list
     *
     * @param context
     */
    void addNew(Context context);

    /**
     * Delete item with given id
     *
     * @param context
     */
    void delete(Context context, T item);
}
