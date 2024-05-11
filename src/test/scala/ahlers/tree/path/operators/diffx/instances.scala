package ahlers.tree.path.operators.diffx

import ahlers.tree.path.operators.Operator.ArrayIndexes
import ahlers.tree.path.operators.Operator.ArraySlice
import ahlers.tree.path.operators.Operator.BracketNotatedChildren
import ahlers.tree.path.operators.Operator.CurrentNode
import ahlers.tree.path.operators.Operator.DeepScan
import ahlers.tree.path.operators.Operator.DotNotatedChild
import ahlers.tree.path.operators.Operator.RootElement
import ahlers.tree.path.operators.Operator.Wildcard
import ahlers.tree.path.terms.diffx.instances._
import com.softwaremill.diffx.Diff

object instances {

  implicit val diffCurrentNode: Diff[CurrentNode.type] = Diff.derived

  implicit val diffRootElement: Diff[RootElement.type] = Diff.derived

  implicit val diffWildcard: Diff[Wildcard.type] = Diff.derived

  implicit val diffDeepScan: Diff[DeepScan.type] = Diff.derived

  implicit val diffDotNotatedChildMatchingName: Diff[DotNotatedChild.MatchingName]              = Diff.derived
  implicit val diffDotNotatedChildMatchingWildcard: Diff[DotNotatedChild.MatchingWildcard.type] = Diff.derived
  implicit val diffDotNotatedChild: Diff[DotNotatedChild]                                       = Diff.derived

  implicit val diffBracketNotatedChildren: Diff[BracketNotatedChildren] = {
    import BracketNotatedChildren.Child
    implicit val diffChild: Diff[Child] = Diff.derived
    Diff.derived
  }

  implicit val diffArrayIndexes: Diff[ArrayIndexes] = Diff.derived

  implicit val diffArraySliceLeftBounded: Diff[ArraySlice.LeftBounded]   = Diff.derived
  implicit val diffArraySliceRightBounded: Diff[ArraySlice.RightBounded] = Diff.derived
  implicit val diffArraySliceBounded: Diff[ArraySlice.Bounded]           = Diff.derived
  implicit val diffArraySlice: Diff[ArraySlice]                          = Diff.derived

}