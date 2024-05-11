package ahlers.tree.path.term.diffx

import ahlers.tree.path.term.Index
import ahlers.tree.path.term.Name
import ahlers.tree.path.term.Wildcard
import com.softwaremill.diffx.Diff

object instances {

  implicit val diffIndex: Diff[Index]            = Diff.derived
  implicit val diffName: Diff[Name]              = Diff.derived
  implicit val diffWildcard: Diff[Wildcard.type] = Diff.derived

}
