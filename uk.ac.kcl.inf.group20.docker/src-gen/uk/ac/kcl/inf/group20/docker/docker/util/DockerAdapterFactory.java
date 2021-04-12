/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.group20.docker.docker.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.group20.docker.docker.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.group20.docker.docker.DockerPackage
 * @generated
 */
public class DockerAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DockerPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DockerAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DockerPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DockerSwitch<Adapter> modelSwitch =
    new DockerSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseStatements(Statements object)
      {
        return createStatementsAdapter();
      }
      @Override
      public Adapter caseRemoveImageStatement(RemoveImageStatement object)
      {
        return createRemoveImageStatementAdapter();
      }
      @Override
      public Adapter caseImageStatement(ImageStatement object)
      {
        return createImageStatementAdapter();
      }
      @Override
      public Adapter caseImageOptions(ImageOptions object)
      {
        return createImageOptionsAdapter();
      }
      @Override
      public Adapter caseDiffStatement(DiffStatement object)
      {
        return createDiffStatementAdapter();
      }
      @Override
      public Adapter caseCpStatement(CpStatement object)
      {
        return createCpStatementAdapter();
      }
      @Override
      public Adapter caseSourceOption(SourceOption object)
      {
        return createSourceOptionAdapter();
      }
      @Override
      public Adapter caseCommitStatement(CommitStatement object)
      {
        return createCommitStatementAdapter();
      }
      @Override
      public Adapter caseCommitOptions(CommitOptions object)
      {
        return createCommitOptionsAdapter();
      }
      @Override
      public Adapter casePortStatement(PortStatement object)
      {
        return createPortStatementAdapter();
      }
      @Override
      public Adapter caseExportStatement(ExportStatement object)
      {
        return createExportStatementAdapter();
      }
      @Override
      public Adapter caseWaitStatement(WaitStatement object)
      {
        return createWaitStatementAdapter();
      }
      @Override
      public Adapter caseLogsStatement(LogsStatement object)
      {
        return createLogsStatementAdapter();
      }
      @Override
      public Adapter caseLogOptions(LogOptions object)
      {
        return createLogOptionsAdapter();
      }
      @Override
      public Adapter caseEventStatement(EventStatement object)
      {
        return createEventStatementAdapter();
      }
      @Override
      public Adapter caseEventOptions(EventOptions object)
      {
        return createEventOptionsAdapter();
      }
      @Override
      public Adapter caseAttachStatement(AttachStatement object)
      {
        return createAttachStatementAdapter();
      }
      @Override
      public Adapter caseInspectStatement(InspectStatement object)
      {
        return createInspectStatementAdapter();
      }
      @Override
      public Adapter caseInspectOptions(InspectOptions object)
      {
        return createInspectOptionsAdapter();
      }
      @Override
      public Adapter casePsStatement(PsStatement object)
      {
        return createPsStatementAdapter();
      }
      @Override
      public Adapter casePsOptions(PsOptions object)
      {
        return createPsOptionsAdapter();
      }
      @Override
      public Adapter caseExecStatement(ExecStatement object)
      {
        return createExecStatementAdapter();
      }
      @Override
      public Adapter caseUnpauseStatement(UnpauseStatement object)
      {
        return createUnpauseStatementAdapter();
      }
      @Override
      public Adapter casePauseStatement(PauseStatement object)
      {
        return createPauseStatementAdapter();
      }
      @Override
      public Adapter caseRestartStatement(RestartStatement object)
      {
        return createRestartStatementAdapter();
      }
      @Override
      public Adapter caseStopStatement(StopStatement object)
      {
        return createStopStatementAdapter();
      }
      @Override
      public Adapter caseStartStatement(StartStatement object)
      {
        return createStartStatementAdapter();
      }
      @Override
      public Adapter caseKillStatement(KillStatement object)
      {
        return createKillStatementAdapter();
      }
      @Override
      public Adapter caseRemoveStatement(RemoveStatement object)
      {
        return createRemoveStatementAdapter();
      }
      @Override
      public Adapter caseRunCreateStatement(RunCreateStatement object)
      {
        return createRunCreateStatementAdapter();
      }
      @Override
      public Adapter caseRunOption(RunOption object)
      {
        return createRunOptionAdapter();
      }
      @Override
      public Adapter caseContainerNameDeclaration(ContainerNameDeclaration object)
      {
        return createContainerNameDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.Statements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.Statements
   * @generated
   */
  public Adapter createStatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.RemoveImageStatement <em>Remove Image Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.RemoveImageStatement
   * @generated
   */
  public Adapter createRemoveImageStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.ImageStatement <em>Image Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.ImageStatement
   * @generated
   */
  public Adapter createImageStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.ImageOptions <em>Image Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.ImageOptions
   * @generated
   */
  public Adapter createImageOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.DiffStatement <em>Diff Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.DiffStatement
   * @generated
   */
  public Adapter createDiffStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.CpStatement <em>Cp Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.CpStatement
   * @generated
   */
  public Adapter createCpStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.SourceOption <em>Source Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.SourceOption
   * @generated
   */
  public Adapter createSourceOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.CommitStatement <em>Commit Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.CommitStatement
   * @generated
   */
  public Adapter createCommitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.CommitOptions <em>Commit Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.CommitOptions
   * @generated
   */
  public Adapter createCommitOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.PortStatement <em>Port Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.PortStatement
   * @generated
   */
  public Adapter createPortStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.ExportStatement <em>Export Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.ExportStatement
   * @generated
   */
  public Adapter createExportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.WaitStatement <em>Wait Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.WaitStatement
   * @generated
   */
  public Adapter createWaitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.LogsStatement <em>Logs Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.LogsStatement
   * @generated
   */
  public Adapter createLogsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.LogOptions <em>Log Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.LogOptions
   * @generated
   */
  public Adapter createLogOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.EventStatement <em>Event Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.EventStatement
   * @generated
   */
  public Adapter createEventStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.EventOptions <em>Event Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.EventOptions
   * @generated
   */
  public Adapter createEventOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.AttachStatement <em>Attach Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.AttachStatement
   * @generated
   */
  public Adapter createAttachStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.InspectStatement <em>Inspect Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.InspectStatement
   * @generated
   */
  public Adapter createInspectStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.InspectOptions <em>Inspect Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.InspectOptions
   * @generated
   */
  public Adapter createInspectOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.PsStatement <em>Ps Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.PsStatement
   * @generated
   */
  public Adapter createPsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.PsOptions <em>Ps Options</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.PsOptions
   * @generated
   */
  public Adapter createPsOptionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.ExecStatement <em>Exec Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.ExecStatement
   * @generated
   */
  public Adapter createExecStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.UnpauseStatement <em>Unpause Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.UnpauseStatement
   * @generated
   */
  public Adapter createUnpauseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.PauseStatement <em>Pause Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.PauseStatement
   * @generated
   */
  public Adapter createPauseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.RestartStatement <em>Restart Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.RestartStatement
   * @generated
   */
  public Adapter createRestartStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.StopStatement <em>Stop Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.StopStatement
   * @generated
   */
  public Adapter createStopStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.StartStatement <em>Start Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.StartStatement
   * @generated
   */
  public Adapter createStartStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.KillStatement <em>Kill Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.KillStatement
   * @generated
   */
  public Adapter createKillStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.RemoveStatement <em>Remove Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.RemoveStatement
   * @generated
   */
  public Adapter createRemoveStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.RunCreateStatement <em>Run Create Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.RunCreateStatement
   * @generated
   */
  public Adapter createRunCreateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.RunOption <em>Run Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.RunOption
   * @generated
   */
  public Adapter createRunOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.group20.docker.docker.ContainerNameDeclaration <em>Container Name Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.group20.docker.docker.ContainerNameDeclaration
   * @generated
   */
  public Adapter createContainerNameDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DockerAdapterFactory
