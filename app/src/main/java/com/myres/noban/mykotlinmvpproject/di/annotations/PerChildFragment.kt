@file:Suppress("DEPRECATION")

package com.myres.noban.mykotlinmvpproject.di.annotations

import javax.inject.Scope
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * Created by Rafiqul Hasan Rony on 1/31/19.
 * Audacity It Solution.
 */

/**
 * A custom scoping annotation that specifies that the lifespan of a dependency be the same as that
 * of a child Fragment (a fragment inside a fragment that is added using
 * Fragment.getChildFragmentManager().
 *
 *
 *
 *
 * This is used to annotate dependencies that behave like a singleton within the lifespan of a
 * child Fragment instead of the entire Application, Activity, or parent Fragment.
 *
 *
 *
 *
 * Note that this does not support a child fragment within a child fragment as conflicting scopes
 * will occur. Child fragments within child fragments should usually be avoided. However, if
 * another level of child fragment is required, then another scope would need to be created
 * (perhaps PerGrandChild custom scope annotation).
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class PerChildFragment
