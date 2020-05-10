package com.ananth.frontrearcamera.util

import android.util.Size
import java.lang.Long.signum

import java.util.Comparator
import kotlin.math.abs

/**
 * Compares two `Size`s based on their aspect ratio most similar to the aspect ratio of the view
 * displayed.
 */
internal class CompareSizesByViewAspectRatio(
    private val viewHeight: Int,
    private val viewWidth: Int) : Comparator<Size> {

    // We cast here to ensure the multiplications won't overflow
//    override fun compare(lhs: Size, rhs: Size) =
//            signum(lhs.width.toLong() * lhs.height - rhs.width.toLong() * rhs.height)

    override fun compare(lhs: Size, rhs: Size): Int {
        val lhsAspect = lhs.height/lhs.width
        val rhsAspect = rhs.height/rhs.height
        val requiredAspectRatio = viewHeight/viewWidth
        val lhsDistanceFrom1 = abs(lhsAspect - requiredAspectRatio)
        val rhsDistanceFrom1 = abs(rhsAspect - requiredAspectRatio)

        return if (lhsDistanceFrom1 < rhsDistanceFrom1) 1
        else -1
    }
    /*
     * Aspect ratio of LHS should be nearer to one
     */

}
